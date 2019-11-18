package com.qf.controller;

import com.qf.domain.DocMsg;
import com.qf.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class DocController {

    @Autowired
    private DocService docService;

    @RequestMapping("/findDocMsg")
    public DocMsg findDocMsg(Long did){
        return docService.findDocByDep(did);
    }

    @RequestMapping("/findPrice")
    public BigDecimal findPrice(String depname){
        return docService.findPrice(depname);
    }
}
