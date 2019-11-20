package com.qf.controller;

import com.qf.domain.DrugMsg;
import com.qf.domain.GithubLoginUser;
import com.qf.service.PioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PioController {
    @Autowired
    PioService pioService;
    @PostMapping("/export")
    public String string(@RequestBody DrugMsg drugMsg){
        return pioService.export(drugMsg);
    }
   
}
