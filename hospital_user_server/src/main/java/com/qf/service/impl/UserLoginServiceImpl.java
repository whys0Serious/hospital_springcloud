package com.qf.service.impl;

import com.qf.dao.UserMsgMapper;
import com.qf.domain.UserMsg;
import com.qf.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserMsgMapper userMsgMapper;

    @Override
    public int insert(UserMsg userMsg) {
        return userMsgMapper.insertSelective(userMsg);
    }

    @Override
    public UserMsg checkPhone(String phone) {
        return userMsgMapper.findByPhone(phone);
    }

    @Override
    public UserMsg checkMail(String mail) {
        return userMsgMapper.findByMail(mail);
    }

    @Override
    public UserMsg findByPkId(Long id) {
        return userMsgMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(UserMsg userMsg) {
        return userMsgMapper.updateByPrimaryKeySelective(userMsg);
    }

    @Override
    public String findByDocid(Long docid) {
        return userMsgMapper.findBypkdocid(docid);
    }

    @Override
    public UserMsg checkDoc(Long docid) {
        return userMsgMapper.checkDoc(docid);
    }

    @Override
    public String findDocName(Long docid) {
        return userMsgMapper.getDocMsg(docid);
    }
}
