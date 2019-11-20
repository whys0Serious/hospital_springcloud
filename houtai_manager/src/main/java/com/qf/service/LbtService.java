package com.qf.service;

import com.qf.domain.Pic;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LbtService {
    String uploadlbtmsg(String path, String imagename);

    List<Pic> findall();

    String updateimg(Integer id, String path);
}
