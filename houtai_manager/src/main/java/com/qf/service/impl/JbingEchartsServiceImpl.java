package com.qf.service.impl;

import com.qf.mapper.JbingEchartsMapper;
import com.qf.service.JbingEchartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JbingEchartsServiceImpl implements JbingEchartsService {
    @Autowired
    JbingEchartsMapper jbingEchartsMapper;
    @Override
    public List findByjibingname() {
        return jbingEchartsMapper.findByJBNames();
    }
}
