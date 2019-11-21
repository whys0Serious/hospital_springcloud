package com.qf.service.impl;

import com.qf.dao.DrugMsgMapper;
import com.qf.domain.DrugMsg;
import com.qf.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugServiceImpl implements DrugService {

    @Autowired
    private DrugMsgMapper drugMsgMapper;
    @Override
    public List<String> findByDepid(Long depid) {
        return drugMsgMapper.selectMsgBydep(depid);
    }

    @Override
    public Long findDepId(String name) {
        return drugMsgMapper.findDepId(name);
    }

    @Override
    public Long findPrice(String name) {
        return drugMsgMapper.findPrice(name);
    }
}
