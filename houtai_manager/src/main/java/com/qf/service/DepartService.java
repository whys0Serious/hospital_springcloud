package com.qf.service;

import com.qf.domain.DepartmenMsg;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartService {
    String insertdepart(DepartmenMsg departmenMsg);

    List<DepartmenMsg> findall();

    String deleteById(Integer id);

    DepartmenMsg findById(Long id);

    String updatedepart(DepartmenMsg departmenMsg);

    List<String> findnames();
}
