package com.qf.domain;

import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ToString
public class UserOrder implements Serializable {
    private Integer pkOid;

    private Long userId;

    private String docName;

    private String depName;

    private BigDecimal price;

    private String statement;

    private String orderNum;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date gmtCreate;

    private Date gmtModified;

    public UserOrder(Integer pkOid, Long userId, String docName, String depName, BigDecimal price, String statement, String orderNum, Date gmtCreate, Date gmtModified) {
        this.pkOid = pkOid;
        this.userId = userId;
        this.docName = docName;
        this.depName = depName;
        this.price = price;
        this.statement = statement;
        this.orderNum = orderNum;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public UserOrder() {
        super();
    }

    public Integer getPkOid() {
        return pkOid;
    }

    public void setPkOid(Integer pkOid) {
        this.pkOid = pkOid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName == null ? null : docName.trim();
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}