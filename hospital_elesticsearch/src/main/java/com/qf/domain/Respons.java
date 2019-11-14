package com.qf.domain;

import lombok.Data;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/14
 * \* Time: 17:22
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Data
public class Respons<T> {

    private List<T> list;
    private long total;

}