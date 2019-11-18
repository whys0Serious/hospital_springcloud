package com.qf.service;

import com.qf.model.Depatement;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/18
 * \* Time: 10:03
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */

public interface Docservice {

    List<Depatement> findAll();
}