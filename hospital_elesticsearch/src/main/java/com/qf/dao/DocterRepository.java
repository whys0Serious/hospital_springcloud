package com.qf.dao;


import com.qf.domain.Docter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocterRepository extends JpaRepository<Docter,Integer> {


    //查看医生信息
    Docter findByDid(Integer pk_docid);

}
