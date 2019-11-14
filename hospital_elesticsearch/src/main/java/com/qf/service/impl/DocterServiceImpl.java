package com.qf.service.impl;

import com.qf.dao.DocterMapper;
import com.qf.dao.DocterRepository;
import com.qf.domain.Docter;
import com.qf.service.DocterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/13
 * \* Time: 21:07
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class DocterServiceImpl implements DocterService {

    @Autowired
    private DocterRepository docterRepository;

    @Override
    public Docter findDocterInfo(Integer pk_docid) {
        return docterRepository.findByDid(pk_docid);
    }

    @Resource
    private DocterMapper docterMapper;


    @Override
    public List<Docter> findDocterNotDepatment(Integer pk_docid) {

        return docterMapper.findByDoctement(pk_docid);
    }
}