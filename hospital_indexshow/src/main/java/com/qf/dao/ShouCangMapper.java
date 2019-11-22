package com.qf.dao;

import com.qf.model.Docter;
import com.qf.model.ShouCang;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    @Delete("delete from shoucang where docid=#{username}")
    int remove(Integer username);
    @Select("select count(*) from shoucang where userid=#{username} and docid=#{doctorid} ")
    int changxunshoucang(Integer username, Integer doctorid);
}