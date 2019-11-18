package com.qf.dao;

import com.qf.domain.MedicalHistory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MedicalHistoryMapper {
    int deleteByPrimaryKey(Long pkMid);

    int insert(MedicalHistory record);

    int insertSelective(MedicalHistory record);

    MedicalHistory selectByPrimaryKey(Long pkMid);

    int updateByPrimaryKeySelective(MedicalHistory record);

    int updateByPrimaryKey(MedicalHistory record);

    List<MedicalHistory> findByUid(Long id);
}