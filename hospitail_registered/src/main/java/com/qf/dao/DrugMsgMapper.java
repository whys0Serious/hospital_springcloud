package com.qf.dao;

import com.qf.domain.DrugMsg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugMsgMapper {
    int deleteByPrimaryKey(Long pkDrugid);

    int insert(DrugMsg record);

    int insertSelective(DrugMsg record);

    DrugMsg selectByPrimaryKey(Long pkDrugid);

    int updateByPrimaryKeySelective(DrugMsg record);

    int updateByPrimaryKey(DrugMsg record);

    Long findDepId(String name);

    List<String> selectMsgBydep(Long depid);

    Long findPrice(String name);
}