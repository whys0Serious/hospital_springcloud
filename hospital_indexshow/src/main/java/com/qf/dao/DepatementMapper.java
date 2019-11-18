package com.qf.dao;

import com.qf.model.Depatement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepatementMapper {


    int deleteByPrimaryKey(Long pkDepid);

    int insert(Depatement record);

    int insertSelective(Depatement record);

    Depatement selectByPrimaryKey(Long pkDepid);

    int updateByPrimaryKeySelective(Depatement record);

    int updateByPrimaryKeyWithBLOBs(Depatement record);

    int updateByPrimaryKey(Depatement record);

    List<Depatement> findAll();
}