package com.qf.controller;

import com.qf.domain.DocReg;
import com.qf.service.DocRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocRegController {
    @Autowired
    DocRegService docRegService;
    @PostMapping("/insertdocreg")
    public String  insertdocreg(@RequestBody DocReg docReg){
        return docRegService.insertdocreg(docReg);
    }
    @PostMapping("/logindoc")
    public String  logindoc(@RequestBody DocReg docReg){
        return docRegService.logindoc(docReg);
    }
}
