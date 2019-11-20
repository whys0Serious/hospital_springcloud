package com.qf.service;

import com.qf.domain.DrugMsg;
import com.qf.domain.GithubLoginUser;

public interface PioService {
    void addexcel();

    String export(DrugMsg drugMsg);

}
