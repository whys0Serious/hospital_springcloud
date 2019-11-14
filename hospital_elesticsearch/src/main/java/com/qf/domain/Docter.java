package com.qf.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "doc_msg")
public class Docter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_docid")
    private Integer did;  //
    private Integer pk_uid;  //
    private Integer pk_depid;  //
    private String doc_name;   //医生名称  *
    private String department;   //科室名称  *
    private String specialty;    //专长
    private String gender;    //性别  *
    private Integer working_age;  //工作年龄 *
    private Integer attendance;  //当月出勤数 *
    @DateTimeFormat(pattern = "yyyy-MM-dd")  //
    private Date gmt_create;  //创建时间 *
    @DateTimeFormat(pattern = "yyyy-MM-dd")  //
    private Date gmt_modified;  //修改时间 *
    private String zhicheng;    //职称   *
    private String doc_pic;    //医生图片  *


}
