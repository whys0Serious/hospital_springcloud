package com.qf.model;

public class ShouCang {
    private Integer id;

    private Integer userid;

    private Integer docid;

    public ShouCang(Integer id, Integer userid, Integer docid) {
        this.id = id;
        this.userid = userid;
        this.docid = docid;
    }

    public ShouCang() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }
}