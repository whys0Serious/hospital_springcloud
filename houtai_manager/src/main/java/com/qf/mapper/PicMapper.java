package com.qf.mapper;

import com.qf.domain.Pic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PicMapper {
    List<Pic> findpic();
    int update(@Param("id") Integer id, @Param("path") String path);
}
