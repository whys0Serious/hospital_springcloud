package com.qf.service;

import com.qf.domain.DocReg;
import org.springframework.stereotype.Service;

@Service
public interface DocRegService {
    String insertdocreg(DocReg docReg);

    String logindoc(DocReg docReg);
}
