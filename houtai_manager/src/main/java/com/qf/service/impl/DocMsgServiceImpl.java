package com.qf.service.impl;

import com.qf.domain.DocMsg;
import com.qf.domain.DocMsgExample;
import com.qf.domain.UserMsg;
import com.qf.mapper.DocMsgMapper;
import com.qf.service.DocMsgService;
import com.qf.util.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DocMsgServiceImpl implements DocMsgService {
    @Autowired
    DocMsgMapper docMsgMapper;

    @Override
    public DocMsg findbyid(Long id) {
        return docMsgMapper.selectByPrimaryKey(id);
    }

    @Override
    public String deleteById(Long id) {
        return docMsgMapper.deleteByPrimaryKey(id)>0?"删除成功":"删除失败";
    }

    @Override
    public List<DocMsg> docMsgList() {
        return docMsgMapper.selectByExample(new DocMsgExample());
    }

    @Override
    public String insertdocmsg(DocMsg docMsg) {
        docMsg.setGmtCreate(new Date());
        docMsg.setGmtModified(new Date());
        return docMsgMapper.insert(docMsg)>0?"添加成功":"添加失败";
    }

    @Override
    public List<String> findnames() {
        return docMsgMapper.findnames();
    }

    @Override
    public String xiugaizige(Long integer, Byte id) {
        return docMsgMapper.xiugaizige(integer,id)>0?"操作成功":"操作失败";
    }

    @Override
    public String tianjiaguanliyaun(UserMsg userMsg) {
        userMsg.setUserPic("http://122.51.42.29:8888/group1/M00/00/00/rBEAEF3JUMyAGmLQAAC_DmX_yHo35..jpg");
        userMsg.setUserPass(Md5Utils.encryptPassword(userMsg.getUserPass(),"健美"));
        return docMsgMapper.tianjiaguanliyaun(userMsg)>0?"添加成功":"添加失败";
    }

    @Override
    public List<String> chaxunyisheng() {
        return docMsgMapper.chaxunyisheng();
    }

    @Override
    public List<UserMsg> yishengzhuce() {
        return docMsgMapper.yishengzhuce();
    }

    @Override
    public String updatedocmsg(DocMsg docMsg) {
        docMsg.setGmtModified(new Date());
        return docMsgMapper.updateByPrimaryKeySelective(docMsg)>0?"修改成功":"修改失败";
    }
}
