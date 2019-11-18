package com.qf.service;

import com.qf.domain.MedicalHistory;

import java.util.List;

public interface MedicalServer {

        List<MedicalHistory> findById(Long id);
}
