package com.qf.controller;

import com.qf.domain.MedicalHistory;
import com.qf.service.MedicalServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicalController {

    @Autowired
    private MedicalServer medicalServer;

    @RequestMapping("/showHistory")
    public List<MedicalHistory> showHistory(Long id){

       return medicalServer.findById(id);
    }
}
