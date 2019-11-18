package com.qf.service;

import com.qf.domain.DocMsg;

import java.math.BigDecimal;
import java.util.List;

public interface DocService{

    DocMsg findDocByDep(Long did);

    BigDecimal findPrice(String depname);
}
