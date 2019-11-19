package com.qf.service;

import com.qf.domain.PageBean;
import com.qf.domain.UserMsg;
import com.qf.domain.UserOrder;

import java.util.List;

public interface AlipayService{
    int saveOrder(UserOrder userOrder);

    List<UserOrder> showOrder(PageBean pageBean);

    int CountByName(Long id);

    int updateState(UserOrder userOrder);

    UserOrder findByOrderNum(String ordernum);

    UserMsg findByUserId(Long uid);
}
