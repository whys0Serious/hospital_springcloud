package com.qf.config;

import lombok.Data;

import java.util.List;

@Data
public class Response<T> {
        private List<T> list;   //查询出的数据集合
        private long total;

}