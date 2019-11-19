package com.qf.controller;

import com.qf.model.Depatement;
import com.qf.model.Docter;
import com.qf.model.Respons;
import com.qf.service.Docservice;
import com.qf.service.DocterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/18
 * \* Time: 9:37
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
public class Doccontroller {

    @Autowired
    private Docservice docservice;
    @Autowired
    private DocterService docterService;
    
    @Autowired
    private RedisTemplate redisTemplate;


    //首页展示科室介绍
    @RequestMapping("/showdepart")
    public List<Depatement> showDepatment(){

        List<Depatement> department =(List<Depatement>) redisTemplate.opsForValue().get("department");

        if (department==null){
            redisTemplate.opsForValue().set("department",docservice.findAll());
            department=(List<Depatement>) redisTemplate.opsForValue().get("department");
        }

        return department;

    }



    //首页展示医生介绍前12个
    @RequestMapping(value = "/searchall")
    public Respons searchAll(Integer page){

        Respons respons =(Respons )redisTemplate.opsForValue().get("docter"+page);

        if (respons==null){
            redisTemplate.opsForValue().set("docter1",docterService.findAll(1));
            redisTemplate.opsForValue().set("docter2",docterService.findAll(2));
            redisTemplate.opsForValue().set("docter3",docterService.findAll(3));

        }

        return respons;

    }


}