package com.qf.mapper;

import com.qf.domain.DocSchedule;
import com.qf.domain.DocScheduleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DocScheduleMapper {
    int countByExample(DocScheduleExample example);

    int deleteByExample(DocScheduleExample example);

    int deleteByPrimaryKey(Long pkShid);

    int insert(DocSchedule record);

    int insertSelective(DocSchedule record);

    List<DocSchedule> selectByExample(DocScheduleExample example);

    DocSchedule selectByPrimaryKey(Long pkShid);

    int updateByExampleSelective(@Param("record") DocSchedule record, @Param("example") DocScheduleExample example);

    int updateByExample(@Param("record") DocSchedule record, @Param("example") DocScheduleExample example);

    int updateByPrimaryKeySelective(DocSchedule record);

    int updateByPrimaryKey(DocSchedule record);
}