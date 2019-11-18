package com.qf.controller;

import com.qf.domain.Department;
import com.qf.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartController {
    @Autowired
    DepartService departService;//注入科室业务层

    @RequestMapping("/findall")//查询所有科室
    public List<Department> findall(){
        return departService.findall();
    }

    @RequestMapping(value = "/findById/{pk_depid}")
    public Department findById(@PathVariable Integer pk_depid){
        return departService.findById(pk_depid);
    }
}
