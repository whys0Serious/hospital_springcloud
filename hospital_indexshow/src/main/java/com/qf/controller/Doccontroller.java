package com.qf.controller;

import com.qf.model.Depatement;
import com.qf.service.Docservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/18
 * \* Time: 9:37
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
public class Doccontroller {

    @Autowired
    private Docservice docservice;


    //首页展示科室介绍
    @RequestMapping("/showdepart")
    public List<Depatement> showDepatment(){

        return docservice.findAll();

    }





}