package com.qf.service.impl;

import com.qf.dao.DocMsgMapper;
import com.qf.domain.DocMsg;
import com.qf.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DocServiceImpl implements DocService {

    @Autowired
    private DocMsgMapper docMsgMapper;

    @Override
    public DocMsg findDocByDep(Long did) {
        return docMsgMapper.selectByDepid(did);
    }

    @Override
    public BigDecimal findPrice(String depname) {
        return docMsgMapper.findPriceBydep(depname);
    }
}
