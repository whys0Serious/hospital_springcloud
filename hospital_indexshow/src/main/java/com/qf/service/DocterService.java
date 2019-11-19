package com.qf.service;

import com.qf.model.Depatement;
import com.qf.model.Docter;
import com.qf.model.Respons;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/18
 * \* Time: 14:33
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface DocterService {

    Respons findAll(int page);
}