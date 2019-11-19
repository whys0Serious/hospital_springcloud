package com.qf.domain;

import java.io.Serializable;
import java.util.Date;

public class DocMsg implements Serializable {
    private Long pkDocid;

    private Long pkUid;

    private Long pkDepid;

    private String docName;

    private String department;

    private String specialty;

    private String gender;

    private Integer workingAge;

    private Integer attendance;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getPkDocid() {
        return pkDocid;
    }

    public void setPkDocid(Long pkDocid) {
        this.pkDocid = pkDocid;
    }

    public Long getPkUid() {
        return pkUid;
    }

    public void setPkUid(Long pkUid) {
        this.pkUid = pkUid;
    }

    public Long getPkDepid() {
        return pkDepid;
    }

    public void setPkDepid(Long pkDepid) {
        this.pkDepid = pkDepid;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName == null ? null : docName.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getWorkingAge() {
        return workingAge;
    }

    public void setWorkingAge(Integer workingAge) {
        this.workingAge = workingAge;
    }

    public Integer getAttendance() {
        return attendance;
    }

    public void setAttendance(Integer attendance) {
        this.attendance = attendance;
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