package com.qf.controller;

import com.qf.domain.MedicalHistory;
import com.qf.service.MedicalServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MedicalController {

    @Autowired
    private MedicalServer medicalServer;

    //根据用户id查询其所有病历
    @RequestMapping("/showHistory")
    public List<MedicalHistory> showHistory(Long id){
       return medicalServer.findById(id);
    }

    //根据病历编号查询单挑病历
    @RequestMapping("/showOneHistory")
    public MedicalHistory showOneHistory(Long mid){
            return medicalServer.findByPkId(mid);
    }

    //为用户新增病历
    @RequestMapping(value = "/insertHistory",method = RequestMethod.POST)
    public void insertHistory(@RequestBody MedicalHistory medicalHistory){
        //添加病历生成时间
        medicalHistory.setGmtCreate(new Date());
        medicalServer.insertHistory(medicalHistory);
    }
}
