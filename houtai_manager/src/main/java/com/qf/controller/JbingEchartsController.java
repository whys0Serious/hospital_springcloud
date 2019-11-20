package com.qf.controller;

import com.qf.service.JbingEchartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JbingEchartsController {
    @Autowired
    private JbingEchartsService jbingEchartsService;
    @GetMapping("findByjibingname")
    public List findByjibingname(){
        return jbingEchartsService.findByjibingname();
    }
}
