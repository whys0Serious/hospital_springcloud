package com.qf.service.impl;

import com.qf.dao.ShouCangMapper;
import com.qf.model.Docter;
import com.qf.service.ShouCangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/11/19
 * \* Time: 15:39
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class ShouCangServiceImpl implements ShouCangService {

    @Autowired
    private ShouCangMapper shouCangMapper;

    @Override
    public String insert(Integer userid, Integer docid) {
       return shouCangMapper.inserta(userid,docid)>0?"收藏成功":"收藏失败";
    }

    @Override
    public String delete(Integer userid, Integer docid) {

        shouCangMapper.deletea(userid, docid);

        return "取消收藏";
    }


    //查询该用户的收藏
    @Override
    public List<Docter> searchlove(Integer userid) {
        return  shouCangMapper.searchlove(userid);
    }
}