package com.qf.dao;

import com.qf.domain.DocMsg;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface DocMsgMapper {
    int deleteByPrimaryKey(Long pkDocid);

    int insert(DocMsg record);

    int insertSelective(DocMsg record);

    DocMsg selectByPrimaryKey(Long pkDocid);

    int updateByPrimaryKeySelective(DocMsg record);

    int updateByPrimaryKey(DocMsg record);

    DocMsg selectByDepid(Long did);

    BigDecimal findPriceBydep(String depname);
}