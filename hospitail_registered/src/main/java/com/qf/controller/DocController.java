package com.qf.controller;

import com.qf.domain.DocMsg;
import com.qf.domain.DrugMsg;
import com.qf.domain.MedicalHistory;
import com.qf.service.DocService;
import com.qf.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class DocController {

    @Autowired
    private DocService docService;

    //根据科室id医生信息
    @RequestMapping("/findDocMsg")
    public DocMsg findDocMsg(Long did){
        return docService.findDocByDep(did);
    }


    //根据科室名称查询价格
    @RequestMapping("/findPrice")
    public BigDecimal findPrice(String depname){
        return docService.findPrice(depname);
    }

    @Autowired
    private DrugService drugService;
    //根据科室id查询药品信息
    @RequestMapping("/findDrugMsg")
    public List<String> findDrugMsg(String depname){
            //先根据科室名称查询科室id
        Long depId = drugService.findDepId(depname);
        return drugService.findByDepid(depId);
    }

    //查询药品价格
    @RequestMapping("/findDrugPrice")
    public Long findDrugPrice(String drugname){
        return drugService.findPrice(drugname);
    }


}
