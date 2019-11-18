package com.qf.service.impl;

import com.qf.domain.DepartmenMsg;
import com.qf.domain.DepartmenMsgExample;
import com.qf.mapper.DepartmenMsgMapper;
import com.qf.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DepartServiceImpl implements DepartService {
    @Override
    public String deleteById(Integer id) {
        return departmenMsgMapper.deleteByPrimaryKey(id.longValue())>0?"删除成功":"删除失败";
    }

    @Override
    public List<DepartmenMsg> findall() {
        return departmenMsgMapper.selectByExample(new DepartmenMsgExample());
    }

    @Autowired
    DepartmenMsgMapper departmenMsgMapper;
    @Override
    public String insertdepart(DepartmenMsg departmenMsg) {
        departmenMsg.setGmtCreate(new Date());
        departmenMsg.setGmtModified(new Date());
        return departmenMsgMapper.insert(departmenMsg)>0?"添加成功":"添加失败";
    }

    @Override
    public List<String> findnames() {
        return departmenMsgMapper.findnames();
    }

    @Override
    public String updatedepart(DepartmenMsg departmenMsg) {
        departmenMsg.setGmtModified(new Date());
        return departmenMsgMapper.updateByPrimaryKeySelective(departmenMsg)>0?"修改成功":"修改失败";
    }

    @Override
    public DepartmenMsg findById(Long id) {
        return departmenMsgMapper.selectByPrimaryKey(id);
    }
}
