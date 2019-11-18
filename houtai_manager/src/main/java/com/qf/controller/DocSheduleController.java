package com.qf.controller;

import com.alibaba.fastjson.JSON;
import com.qf.domain.DocSchedule;
import com.qf.mapper.DocScheduleMapper;
import com.qf.service.DepartService;
import com.qf.service.DocSheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class DocSheduleController {
    @Autowired
    DepartService departService;
    @Autowired
    private DocSheduleService sheduleService;
    @GetMapping("/findnamesdoc")
    public List<String> findnamesdoc(){
        return departService.findnames();
    }
    @PostMapping("/insertdocse")
    public String insertdocse(@RequestBody DocSchedule docSchedule ){
        return sheduleService.insertdocse(docSchedule);
    }
    @GetMapping("/findalldoc")
    public List<DocSchedule> findalldoc(){
        return sheduleService.findalldoc();
    }
    @GetMapping("/deleteByIdds/{id}")
    public String deleteByIdds(@PathVariable("id") Long id){
        return sheduleService.deleteById(id);
    }
    @GetMapping("/findalldocsebyid/{id}")
    public DocSchedule findalldocsebyid(@PathVariable("id") Long id){
        return sheduleService.findalldocsebyid(id);
    }
}
