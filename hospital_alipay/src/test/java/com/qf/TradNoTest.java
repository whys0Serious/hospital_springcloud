package com.qf;

import com.alipay.api.AlipayApiException;
import com.qf.config.AlipayUtil;
import com.qf.domain.PageBean;
import com.qf.domain.UserOrder;
import com.qf.service.AlipayService;
import lombok.ToString;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TradNoTest {

    @Autowired
    private AlipayUtil alipayUtil;

//        @Test
//        public void test() throws AlipayApiException {
//            BigDecimal bigDecimal=new BigDecimal("3.33");
//            alipayUtil.trade_no="123123113135";
//            alipayUtil.pay(bigDecimal,"眼科");
//        }

        @Autowired
        private AlipayService alipayService;
        @Test
        public void test1(){
            PageBean pageBean=new PageBean();
            pageBean.setId(10);
            pageBean.setPageSize(0);
            pageBean.setSize(2);
            List<UserOrder> showOrder = alipayService.showOrder(pageBean);
            System.out.println(showOrder);
        }
}
