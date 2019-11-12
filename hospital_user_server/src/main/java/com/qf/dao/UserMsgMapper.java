package com.qf.dao;

import com.qf.domain.UserMsg;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMsgMapper {
    int deleteByPrimaryKey(Long pkUid);

    int insert(UserMsg record);

    int insertSelective(UserMsg record);

    UserMsg selectByPrimaryKey(Long pkUid);

    int updateByPrimaryKeySelective(UserMsg record);

    int updateByPrimaryKey(UserMsg record);

    UserMsg findByPhone(String phone);

    UserMsg findByMail(String mail);

}