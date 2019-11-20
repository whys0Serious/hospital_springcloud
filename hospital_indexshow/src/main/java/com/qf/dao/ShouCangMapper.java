package com.qf.dao;

import com.qf.model.Docter;
import com.qf.model.ShouCang;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShouCangMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShouCang record);

    int insertSelective(ShouCang record);

    ShouCang selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShouCang record);

    int updateByPrimaryKey(ShouCang record);

    int inserta(@Param("userid") Integer userid, @Param("docid") Integer docid);

    int deletea(@Param("userid") Integer userid, @Param("docid") Integer docid);


    List<Docter> searchlove(Integer userid);
}