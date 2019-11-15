package com.qf.service;

import com.qf.domain.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartService {
    List<Department> findall();
    //根据id查一个
    Department findById(Integer pk_depid);
}
