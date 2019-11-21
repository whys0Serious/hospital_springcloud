package com.qf.mapper;

import com.qf.domain.DepartmenMsg;
import com.qf.domain.DepartmenMsgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DepartmenMsgMapper {
    int countByExample(DepartmenMsgExample example);

    int deleteByExample(DepartmenMsgExample example);

    int deleteByPrimaryKey(Long pkDepid);

    int insert(DepartmenMsg record);

    int insertSelective(DepartmenMsg record);

    List<DepartmenMsg> selectByExample(DepartmenMsgExample example);

    DepartmenMsg selectByPrimaryKey(Long pkDepid);

    int updateByExampleSelective(@Param("record") DepartmenMsg record, @Param("example") DepartmenMsgExample example);

    int updateByExample(@Param("record") DepartmenMsg record, @Param("example") DepartmenMsgExample example);

    int updateByPrimaryKeySelective(DepartmenMsg record);

    int updateByPrimaryKey(DepartmenMsg record);
    @Select(value = "select dep_name from department_msg")
    List<String> findnames();

    //根据名称查询科室id
    Long findBydepName(String name);
}