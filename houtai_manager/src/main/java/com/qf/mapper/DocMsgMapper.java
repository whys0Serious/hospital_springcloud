package com.qf.mapper;

import com.qf.domain.DocMsg;
import com.qf.domain.DocMsgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DocMsgMapper {
    int countByExample(DocMsgExample example);
    @Select(value = ("select doc_name from doc_msg"))
    List<String> findnames();
    int deleteByExample(DocMsgExample example);

    int deleteByPrimaryKey(Long pkDocid);

    int insert(DocMsg record);

    int insertSelective(DocMsg record);

    List<DocMsg> selectByExample(DocMsgExample example);

    DocMsg selectByPrimaryKey(Long pkDocid);

    int updateByExampleSelective(@Param("record") DocMsg record, @Param("example") DocMsgExample example);

    int updateByExample(@Param("record") DocMsg record, @Param("example") DocMsgExample example);

    int updateByPrimaryKeySelective(DocMsg record);

    int updateByPrimaryKey(DocMsg record);
}