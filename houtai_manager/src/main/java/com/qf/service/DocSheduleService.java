package com.qf.service;

import com.qf.domain.DocSchedule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocSheduleService {
    String insertdocse(DocSchedule docSchedule);

    List<DocSchedule> findalldoc();

    String deleteById(Long id);

    DocSchedule findalldocsebyid(Long id);
}
