package com.qf.service.impl;

import com.qf.dao.UserOrderMapper;
import com.qf.domain.PageBean;
import com.qf.domain.UserMsg;
import com.qf.domain.UserOrder;
import com.qf.service.AlipayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlipayServiceImpl implements AlipayService {

    @Autowired
    private UserOrderMapper userOrderMapper;

    @Override
    public int saveOrder(UserOrder userOrder) {
        return userOrderMapper.insertSelective(userOrder);
    }

    @Override
    public List<UserOrder> showOrder(PageBean pageBean) {

        return userOrderMapper.selectByName(pageBean);
    }

    @Override
    public int CountByName(Long id) {
        return userOrderMapper.countSize(id);
    }

    @Override
    public int updateState(UserOrder userOrder) {
        return userOrderMapper.updateByIdAndOrderId(userOrder);
    }

    @Override
    public UserOrder findByOrderNum(String ordernum) {
        return userOrderMapper.findByOrderNum(ordernum);
    }

    @Override
    public UserMsg findByUserId(Long uid) {
        return userOrderMapper.findUserById(uid);
    }
}
