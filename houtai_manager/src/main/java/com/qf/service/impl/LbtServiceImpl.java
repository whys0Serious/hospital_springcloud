package com.qf.service.impl;

import com.qf.domain.Pic;
import com.qf.mapper.PicMapper;
import com.qf.service.LbtService;
import com.qf.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LbtServiceImpl implements LbtService {
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    PicMapper picMapper;

    @Override
    public String updateimg(Integer id, String path) {
        return picMapper.update(id,path)>0?"修改成功":"修改失败";
    }

    @Override
    public List<Pic> findall() {
        return picMapper.findpic();
    }

    @Override
    public String uploadlbtmsg(String path,String imagename) {
        redisUtil.lSet("image",path);
        return "添加成功";
    }
}
