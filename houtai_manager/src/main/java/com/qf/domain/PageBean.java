package com.qf.domain;


import lombok.Data;

import java.util.List;
@Data
public class PageBean {
    List list;
    private Integer totalpage;
    private Integer allcount;
}
