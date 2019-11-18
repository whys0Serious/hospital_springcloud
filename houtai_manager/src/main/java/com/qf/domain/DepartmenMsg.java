package com.qf.domain;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@ToString
public class DepartmenMsg implements Serializable {
    private Long pkDepid;

    private String depName;

    private Long charge;

    private Integer visitNum;

    private String departmentPic;

    private String departmentType;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

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

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType == null ? null : departmentType.trim();
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