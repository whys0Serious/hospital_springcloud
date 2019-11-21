package com.qf.service.impl;

import com.qf.dao.MedicalHistoryMapper;
import com.qf.domain.MedicalHistory;
import com.qf.service.MedicalServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalServerImpl implements MedicalServer {

    @Autowired
    private MedicalHistoryMapper medicalHistoryMapper;
    @Override
    public List<MedicalHistory> findById(Long id) {
        return medicalHistoryMapper.findByUid(id);
    }

    @Override
    public MedicalHistory findByPkId(Long pimid) {
        return medicalHistoryMapper.selectByPrimaryKey(pimid);
    }

    @Override
    public void insertHistory(MedicalHistory medicalHistory) {
        medicalHistoryMapper.insertSelective(medicalHistory);
    }
}
