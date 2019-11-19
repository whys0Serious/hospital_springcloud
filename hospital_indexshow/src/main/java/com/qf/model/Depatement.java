package com.qf.model;

import java.io.Serializable;
import java.util.Date;

public class Depatement implements Serializable {
    private Long pkDepid;

    private String depName;

    private Long charge;

    private Integer visitNum;

    private String departmentPic;

    private Date gmtCreate;

    private Date gmtModified;

    private String departmentType;

    public Depatement(Long pkDepid, String depName, Long charge, Integer visitNum, String departmentPic, Date gmtCreate, Date gmtModified, String departmentType) {
        this.pkDepid = pkDepid;
        this.depName = depName;
        this.charge = charge;
        this.visitNum = visitNum;
        this.departmentPic = departmentPic;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.departmentType = departmentType;
    }

    public Depatement() {
        super();
    }

    public Long getPkDepid() {
        return pkDepid;
    }

    public void setPkDepid(Long pkDepid) {
        this.pkDepid = pkDepid;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
    }

    public Long getCharge() {
        return charge;
    }

    public void setCharge(Long charge) {
        this.charge = charge;
    }

    public Integer getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }

    public String getDepartmentPic() {
        return departmentPic;
    }

    public void setDepartmentPic(String departmentPic) {
        this.departmentPic = departmentPic == null ? null : departmentPic.trim();
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

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType == null ? null : departmentType.trim();
    }
}