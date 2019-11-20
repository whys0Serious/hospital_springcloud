package com.qf.controller;

import com.qf.domain.DocMsg;
import com.qf.domain.UserMsg;
import com.qf.service.DocMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
public class DocMsgController {
    @Autowired
    DocMsgService docMsgService;
    @PostMapping("/insertdocmsg")
    public String insertdocmsg(@RequestBody DocMsg docMsg){
        return docMsgService.insertdocmsg(docMsg);
    }
    @GetMapping("/docMsgList")
    public List<DocMsg> docMsgList(){
        return docMsgService.docMsgList();
    }
    @GetMapping("/deleteByIdDoc/{id}")
    public String deleteByIdDoc(@PathVariable Long id){
        return docMsgService.deleteById(id);
    }
    @GetMapping("/findbyid/{id}")
    public DocMsg docMsg(@PathVariable Long id){
        return docMsgService.findbyid(id);
    }
    @PostMapping("/updatedocmsg")
    public String updatedocmsg(@RequestBody DocMsg docMsg){
        return docMsgService.updatedocmsg(docMsg);
    }
    @GetMapping("/findnamesdocmsg")
    public List<String> findnamesdocmsg(){
        return docMsgService.findnames();
    }
    @GetMapping("/yishengzhuce")
    public List<UserMsg> yishengzhuce(){
        return docMsgService.yishengzhuce();
    }
    @GetMapping("/xiugaizige/{id}/{cs}")
    public String xiugaizige(@PathVariable("id") Long id,@PathVariable("cs") Byte cs){
        return docMsgService.xiugaizige(id,cs);
    }
    @PostMapping("/tianjiaguanliyaun")
    public String tianjiaguanliyaun(@RequestBody UserMsg userMsg){
        return docMsgService.tianjiaguanliyaun(userMsg);
    }

}
