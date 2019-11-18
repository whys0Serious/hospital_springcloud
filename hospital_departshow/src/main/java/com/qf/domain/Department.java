package com.qf.domain;

import lombok.Data;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "department_msg")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk_depid;

    private String dep_name;

    private Long charge;

    private Integer visit_num;

    private String department_pic;

    private String department_type;

    private Date gmt_create;

    private Date gmt_modified;

    private static final long serialVersionUID = 1L;
}
