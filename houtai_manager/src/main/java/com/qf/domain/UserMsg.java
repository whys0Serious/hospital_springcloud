package com.qf.domain;

import java.io.Serializable;
import java.util.Date;

public class UserMsg implements Serializable {
    private Long pkUid;

    private Long pkDocid;

    private String userName;

    private String userPass;

    private String userMail;

    private String userPic;

    private String userGender;

    private Integer userAge;

    private String userPhone;

    private Byte isActivated;

    private String identity;

    private Date gmtCreate;

    private Date gmtModified;

    @Override
    public String toString() {
        return "UserMsg{" +
                "pkUid=" + pkUid +
                ", pkDocid=" + pkDocid +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userPic='" + userPic + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userAge=" + userAge +
                ", userPhone='" + userPhone + '\'' +
                ", isActivated=" + isActivated +
                ", identity='" + identity + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }

    public UserMsg(Long pkUid, Long pkDocid, String userName, String userPass, String userMail, String userPic, String userGender, Integer userAge, String userPhone, Byte isActivated, String identity, Date gmtCreate, Date gmtModified) {
        this.pkUid = pkUid;
        this.pkDocid = pkDocid;
        this.userName = userName;
        this.userPass = userPass;
        this.userMail = userMail;
        this.userPic = userPic;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userPhone = userPhone;
        this.isActivated = isActivated;
        this.identity = identity;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public UserMsg() {
        super();
    }

    public Long getPkUid() {
        return pkUid;
    }

    public void setPkUid(Long pkUid) {
        this.pkUid = pkUid;
    }

    public Long getPkDocid() {
        return pkDocid;
    }

    public void setPkDocid(Long pkDocid) {
        this.pkDocid = pkDocid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail == null ? null : userMail.trim();
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic == null ? null : userPic.trim();
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Byte getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(Byte isActivated) {
        this.isActivated = isActivated;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
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