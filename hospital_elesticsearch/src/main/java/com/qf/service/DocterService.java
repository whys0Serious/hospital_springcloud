package com.qf.service;

import com.qf.domain.Docter;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/13
 * \* Time: 21:01
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface DocterService {
    Docter findDocterInfo(Integer pk_docid);


    List<Docter> findDocterNotDepatment(Integer pk_docid);
}