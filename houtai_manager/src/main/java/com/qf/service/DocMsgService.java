package com.qf.service;

import com.qf.domain.DocMsg;
import com.qf.domain.UserMsg;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DocMsgService {
    String insertdocmsg(DocMsg docMsg);

    List<DocMsg> docMsgList();

    String deleteById(Long id);

    DocMsg findbyid(Long id);

    String updatedocmsg(DocMsg docMsg);

    List<String> findnames();

    List<UserMsg> yishengzhuce();

    String xiugaizige(Long id, Byte cs);

    String tianjiaguanliyaun(UserMsg userMsg);
}
