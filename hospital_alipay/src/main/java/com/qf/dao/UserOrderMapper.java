package com.qf.dao;

import com.qf.domain.PageBean;
import com.qf.domain.UserOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserOrderMapper {
    int deleteByPrimaryKey(Integer pkOid);

    int insert(UserOrder record);

    int insertSelective(UserOrder record);

    UserOrder selectByPrimaryKey(Integer pkOid);

    int updateByPrimaryKeySelective(UserOrder record);

    int updateByPrimaryKey(UserOrder record);

    List<UserOrder> selectByName(PageBean pageBean);

    int countSize (Integer id);

    int updateByIdAndOrderId(UserOrder userOrder);
}