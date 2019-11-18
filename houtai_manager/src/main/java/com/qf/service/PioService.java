package com.qf.service;

import com.qf.domain.DrugMsg;

public interface PioService {
    void addexcel();

    String export(DrugMsg drugMsg);
}
