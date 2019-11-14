package com.qf.dao;


import com.qf.domain.Docter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DocterMapper {

    //查询同科室不同人
    List<Docter> findByDoctement(Integer pk_docid);
}
