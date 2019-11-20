package com.qf.controller;

import com.qf.domain.Pic;
import com.qf.service.LbtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LbtMsgController {
    @Autowired
    LbtService lbtService;
    @GetMapping("/uploadlbtmsg/{path}}")
    public String uploadlbtmsg(@PathVariable("path") String path){
        return lbtService.uploadlbtmsg(path,"");
    }
    @GetMapping("/findalllbtmsg")
    public List findall(){
        return lbtService.findall();
    }
    @PostMapping("/updateimg")
    public String updateimg(@RequestBody Pic pic){
        return lbtService.updateimg(pic.getId(),pic.getPath());
    }
}
