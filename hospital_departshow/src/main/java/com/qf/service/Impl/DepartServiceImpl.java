package com.qf.service.Impl;

import com.qf.dao.DepartmentRepository;
import com.qf.domain.Department;
import com.qf.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartServiceImpl implements DepartService {
@Autowired
    DepartmentRepository departmentRepository;
    @Override
    public List<Department> findall() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findById(Integer pk_depid) {
        Optional<Department> byId=departmentRepository.findById(pk_depid);
     if (byId.isPresent()){
         Department department=byId.get();
         return department;
     }
     return null;
    }
}
