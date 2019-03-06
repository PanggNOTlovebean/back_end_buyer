package com.example.buyer.mapper;

import com.example.buyer.object.OrderDetailPaid;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailPaidMapperTest {
    @Autowired
    OrderDetailPayedMapper mapper;
    @Test
    public void save() {
        OrderDetailPaid orderDetailPaid =new OrderDetailPaid();
        orderDetailPaid.setId("111");
        orderDetailPaid.setDate(new Timestamp(System.currentTimeMillis()));
        orderDetailPaid.setPrice(12);
        orderDetailPaid.setName("黑椒牛肉粒");
        System.out.println(orderDetailPaid);
        mapper.save(orderDetailPaid);
    }
}