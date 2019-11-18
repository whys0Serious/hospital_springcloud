package com.qf.mapper;

import com.qf.domain.DocReg;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DocRegMapper {
    @Insert(value = "insert into docreg(docname,docpass) value(#{docname},#{docpass}) ")
    Integer insertdocreg(DocReg docReg);
    @Select(value = "select * from docreg where docname=#{docname} and docpass=#{docpass} ")
    DocReg logindoc(DocReg docReg);
}
