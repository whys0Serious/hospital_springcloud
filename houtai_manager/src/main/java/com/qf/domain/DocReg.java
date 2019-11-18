package com.qf.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class DocReg implements Serializable {
    private Integer docid;
    private String docname;
    private String docpass;
}
