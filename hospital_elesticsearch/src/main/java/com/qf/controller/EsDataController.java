package com.qf.controller;

import com.qf.dao.DocterRepository;
import com.qf.domain.Docter;
import com.qf.domain.Respons;
import com.qf.service.DocterService;
import net.sf.json.JSONObject;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.IndicesClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class EsDataController {

    @Autowired
    private DocterRepository docterRepository;

    @Autowired
    private DocterService docterService;

    //搜索
    @ResponseBody
    @RequestMapping("/searchall/{page}/{size}")
    public Respons search(@PathVariable("page") Integer page, @PathVariable("size") Integer size,@RequestParam("department")String department,@RequestParam("zhicheng")String zhicheng) throws IOException {
        //声明需要查询的索引库
        SearchRequest searchRequest = new SearchRequest("docter_info");
        searchRequest.types("doc");
        //搜索源对象构建
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();


        if (department.equals("") || department==null || zhicheng.equals("") || zhicheng==null){
            //搜索全部
            searchSourceBuilder.query(QueryBuilders.matchAllQuery());
        }else {
            searchSourceBuilder.query(QueryBuilders.termQuery("department",department));
        }


        //分页查询
        //设置分页参数  当前页码
//        int page = 2; //页码
//        int size = 12; //每页显示个数
        int from = (page -1) *size;  //起记录下标
        //设置分页
        searchSourceBuilder.size(size);
        searchSourceBuilder.from(from);
        //设置搜索源
        searchRequest.source(searchSourceBuilder);
        //使用客户端查询
        SearchResponse searchResponse = restHighLevelClient.search(searchRequest);

        //查询结束后返回的json  搜索匹配结果
        SearchHits hits = searchResponse.getHits();
        //hits下面的数据   获取总记录数
        long totalHits = hits.getTotalHits();
        System.out.println("当前查询出的条数为：===============" + totalHits);
        //匹配度较高的前N个文档(查询出的数据)
        SearchHit[] hits1 = hits.getHits();
        //新建一个数组
        List<Docter> docters =new ArrayList<>();
        for (SearchHit obj:hits1) {
            JSONObject jsonObject = JSONObject.fromObject(obj.getSourceAsMap());
            Docter docter = (Docter) JSONObject.toBean(jsonObject, Docter.class);
            docters.add(docter);
        }
        Respons respons = new Respons();
        respons.setList(docters);
        respons.setTotal(totalHits);


        return respons;
    }



    @Autowired
    private RestHighLevelClient restHighLevelClient;




    //创建索引库
    @RequestMapping("/createBase")
    @ResponseBody
    public String createBase(){
        //创建索引请求对象和名称
        CreateIndexRequest createIndexRequest = new CreateIndexRequest("docter_info");
        //设置参数，分片数和副本数
        createIndexRequest.settings(Settings.builder().put("number_of_shards",1)
                                        .put("number_of_replicas",0));
        //设置映射
        createIndexRequest.mapping("doc","{\n" +
                "                \"properties\": {\n" +
                "                    \"doc_name\": {\n" +
                "                        \"type\": \"keyword\"\n" +
                "                    },\n" +
                "                    \"department\": {\n" +
                "                        \"type\": \"text\",\n" +
                "                        \"analyzer\": \"ik_max_word\",\n" +
                "                        \"search_analyzer\": \"ik_smart\"\n" +
                "                    },\n" +
                "                    \"specialty\": {\n" +
                "                        \"type\": \"text\",\n" +
                "                        \"analyzer\": \"ik_max_word\",\n" +
                "                        \"search_analyzer\": \"ik_smart\"\n" +
                "                    },\n" +
                "                    \"zhicheng\": {\n" +
                "                        \"type\": \"keyword\"\n" +
                "                    },\n" +
                "                    \"did\": {\n" +
                "                        \"type\": \"keyword\"\n" +
                "                    },\n" +
                "                    \"gender\": {\n" +
                "                        \"type\": \"keyword\"\n" +
                "                    },\n" +
                "\t     \"doc_pic\":{\n" +
                "\t       \"type\":\"text\",\n" +
                "\t       \"index\":false\n" +
                "\t    },\n" +
                "                    \"working_age\": {\n" +
                "                        \"type\": \"integer\"\n" +
                "                    },\n" +
                "                    \"attendance\": {\n" +
                "                        \"type\": \"integer\"\n" +
                "                    }\n" +
                "                   \n" +
                "                }\n" +
                " }" ,XContentType.JSON);

        //创建操作索引客户端
        IndicesClient indices = restHighLevelClient.indices();
        try {
            CreateIndexResponse createIndexResponse = indices.create(createIndexRequest);
            if (createIndexResponse.isShardsAcknowledged()){
                return "创建成功";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "操作异常";
    }


    @RequestMapping("/addEs")
    @ResponseBody
    public String addEs(){
        IndexRequest indexRequest = new IndexRequest("docter_info","doc");
        List<Docter> docterList = docterRepository.findAll();
        Map map=new HashMap();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Docter docter : docterList) {
            map.put("did",docter.getDid());
            map.put("doc_name",docter.getDoc_name());
            map.put("department",docter.getDepartment());
            map.put("specialty",docter.getSpecialty());
            map.put("zhicheng",docter.getZhicheng());
            map.put("gender",docter.getGender());
            map.put("working_age",docter.getWorking_age());
            map.put("attendance",docter.getAttendance());
            map.put("doc_pic",docter.getDoc_pic());
            indexRequest.id(String.valueOf(docter.getDid()));
            indexRequest.source(map);
            try {
                IndexResponse response = restHighLevelClient.index(indexRequest);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "成功";
    }


    @RequestMapping(value = "/findDocterInfo",method = RequestMethod.POST)
    @ResponseBody
    public Docter findDocterInfo(@RequestBody Docter docter){
        return docterService.findDocterInfo(docter.getDid());
    }






    @RequestMapping(value = "/findDocterNotDepatment/{pk_docid}",method = RequestMethod.GET)
    @ResponseBody
    public List<Docter> findDocterInfo(@PathVariable("pk_docid") Integer pk_docid){
        List<Docter> list =docterService.findDocterNotDepatment(pk_docid);
        return list;
    }






}
