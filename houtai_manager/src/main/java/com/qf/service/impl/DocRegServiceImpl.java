package com.qf.service.impl;

import com.qf.domain.DocReg;
import com.qf.mapper.DocRegMapper;
import com.qf.service.DocRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocRegServiceImpl implements DocRegService {
    @Autowired
    DocRegMapper docRegMapper;

    @Override
    public String logindoc(DocReg docReg) {
        return docRegMapper.logindoc(docReg)!=null?"登陆成功":"登陆失败";
    }

    @Override
    public String insertdocreg(DocReg docReg) {
        return docRegMapper.insertdocreg(docReg)>0?"注册成功":"注册失败";
    }
}
