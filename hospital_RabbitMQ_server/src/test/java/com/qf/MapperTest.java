package com.qf;

import com.qf.dao.UserMsgMapper;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {
        @Autowired
    private UserMsgMapper userMsgMapper;

        @Test
    public void test1(){
            Long aLong = new Long(10);
            System.out.println(userMsgMapper.selectByPrimaryKey(aLong));
        }
}
