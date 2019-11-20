package com.qf.service.impl;

import com.qf.domain.DocSchedule;
import com.qf.domain.DocScheduleExample;
import com.qf.domain.GithubLoginUser;
import com.qf.mapper.DocScheduleMapper;
import com.qf.service.DocSheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocSheduleServiceImpl implements DocSheduleService {
    @Autowired
    DocScheduleMapper docScheduleMapper;

    @Override
    public List<DocSchedule> findalldoc() {
        return docScheduleMapper.selectByExample(new DocScheduleExample());
    }

    @Override
    public String deleteById(Long id) {
        return docScheduleMapper.deleteByPrimaryKey(id)>0?"删除成功":"删除失败";
    }

    @Override
    public DocSchedule findalldocsebyid(Long id) {
        return docScheduleMapper.selectByPrimaryKey(id);
    }


    @Override
    public String insertdocse(DocSchedule docSchedule) {
        return docScheduleMapper.insert(docSchedule)>0?"新增成功":"添加失败";
    }
}
