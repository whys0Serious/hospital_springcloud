package com.qf.controller;

import com.qf.domain.DepartmenMsg;
import com.qf.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
* 科室控制层*/
@RestController
public class DepartController {
    @Autowired
    DepartService departService;//注入科室业务层
    @PostMapping("/insertdepart")
    public String insertdepart(@RequestBody DepartmenMsg departmenMsg){
        return  departService.insertdepart(departmenMsg);
    }
    @GetMapping("/findalldepart")//查询所有科室
    public List<DepartmenMsg> findalldepart(){
        return departService.findall();
    }
    @GetMapping("/deleteByIddepart/{id}")//根据id删除
    public String deleteByIddepart(@PathVariable("id") Integer id){
        return departService.deleteById(id);
    }
    @GetMapping("/departmenMsg/{id}")//根据id查询
    public DepartmenMsg departmenMsg(@PathVariable("id") Long id){
        return departService.findById(id);
    }
    @PostMapping("/updatedepart")//根据idx修改
    public String updatedepart(@RequestBody DepartmenMsg departmenMsg){
        return departService.updatedepart(departmenMsg);
    }
    @GetMapping("/findnamesdepart")
    public List<String> findnamesdepart(){
        return departService.findnames();
    }
}
