package com.qf.domain;

import lombok.ToString;

import java.io.Serializable;
@ToString
public class DocSchedule implements Serializable {
    private Long pkShid;

    private String week;

    private String workTime;

    private String docName;

    private String department;

    private static final long serialVersionUID = 1L;

    public Long getPkShid() {
        return pkShid;
    }

    public void setPkShid(Long pkShid) {
        this.pkShid = pkShid;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime == null ? null : workTime.trim();
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
}