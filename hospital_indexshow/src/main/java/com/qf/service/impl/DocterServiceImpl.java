package com.qf.service.impl;

import com.qf.dao.DocterRepostry;
import com.qf.model.Docter;
import com.qf.model.Respons;
import com.qf.service.DocterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/18
 * \* Time: 14:35
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class DocterServiceImpl implements DocterService {

    @Autowired
    private DocterRepostry docterRepostry;
//    @Autowired
//    private Respons respons;

    @Override
    public Respons findAll(int page) {

        Pageable pages= PageRequest.of(page-1,4);
        Page<Docter> all=docterRepostry.findAll(pages);
        Respons response=new Respons();
        response.setList(all.getContent());
        response.setTotal(all.getTotalElements());
        return response;

    }
}