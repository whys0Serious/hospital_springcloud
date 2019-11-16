package com.qf.service;

import com.qf.domain.PageBean;
import com.qf.domain.UserOrder;

import java.util.List;

public interface AlipayService{
    int saveOrder(UserOrder userOrder);

    List<UserOrder> showOrder(PageBean pageBean);

    int CountByName(int id);

    int updateState(UserOrder userOrder);
}
