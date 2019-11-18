package com.qf.service;

import com.qf.domain.UserMsg;

public interface UserLoginService {

    int insert(UserMsg userMsg);

    UserMsg checkPhone(String phone);

    UserMsg checkMail(String mail);

    UserMsg findByPkId(Long id);

    int updateById(UserMsg userMsg);

    String findByDocid(Long docid);

    UserMsg checkDoc(Long docid);

    String findDocName(Long docid);

}
