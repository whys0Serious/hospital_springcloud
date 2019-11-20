package com.qf.service;

import com.qf.model.Docter;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/19
 * \* Time: 15:37
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface ShouCangService {


    String insert(Integer userid, Integer docid);

    String delete(Integer userid, Integer docid);

    List<Docter> searchlove(Integer userid);
}