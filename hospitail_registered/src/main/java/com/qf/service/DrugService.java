package com.qf.service;

import com.qf.domain.DrugMsg;

import java.util.List;

public interface DrugService {

    List<String> findByDepid(Long depid);

    Long findDepId(String name);

    Long findPrice(String name);
}
