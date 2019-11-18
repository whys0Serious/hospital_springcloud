package com.qf.domain;

import java.util.Date;

public class MedicalHistory {
    private Long pkMid;

    private Long pkDepid;

    private Long pkDocid;

    private Long pkUid;

    private String docName;

    private String department;

    private String diseaseName;

    private String drugName;

    private String docAdvice;

    private Long drugPrice;

    private Date gmtCreate;

    private Date gmtModified;

    public MedicalHistory(Long pkMid, Long pkDepid, Long pkDocid, Long pkUid, String docName, String department, String diseaseName, String drugName, String docAdvice, Long drugPrice, Date gmtCreate, Date gmtModified) {
        this.pkMid = pkMid;
        this.pkDepid = pkDepid;
        this.pkDocid = pkDocid;
        this.pkUid = pkUid;
        this.docName = docName;
        this.department = department;
        this.diseaseName = diseaseName;
        this.drugName = drugName;
        this.docAdvice = docAdvice;
        this.drugPrice = drugPrice;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public MedicalHistory() {
        super();
    }

    public Long getPkMid() {
        return pkMid;
    }

    public void setPkMid(Long pkMid) {
        this.pkMid = pkMid;
    }

    public Long getPkDepid() {
        return pkDepid;
    }

    public void setPkDepid(Long pkDepid) {
        this.pkDepid = pkDepid;
    }

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

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName == null ? null : diseaseName.trim();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public String getDocAdvice() {
        return docAdvice;
    }

    public void setDocAdvice(String docAdvice) {
        this.docAdvice = docAdvice == null ? null : docAdvice.trim();
    }

    public Long getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(Long drugPrice) {
        this.drugPrice = drugPrice;
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