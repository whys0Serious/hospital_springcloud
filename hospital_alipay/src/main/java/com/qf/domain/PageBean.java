package com.qf.domain;

import lombok.Data;

@Data
public class PageBean {

    private Integer id;
    private Integer page;
    private Integer size;
    private Integer pageSize;

}
