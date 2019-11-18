package com.qf.service.impl;

import com.qf.dao.DepatementMapper;
import com.qf.model.Depatement;
import com.qf.service.Docservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/18
 * \* Time: 10:13
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class DocserviceImpl implements Docservice {

    @Autowired
    private DepatementMapper depatementMapper;

    @Override
    public List<Depatement> findAll() {

        return depatementMapper.findAll();
    }
}