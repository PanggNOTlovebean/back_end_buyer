package com.example.buyer.mapper;

import com.example.buyer.object.OrderPaid;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderPaidMapperTest {
    @Autowired
    OrderPaidMapper orderPaidMapper;
    @Test
    public void save() {
        OrderPaid orderPaid=new OrderPaid();
        orderPaid.setDate(new Date(System.currentTimeMillis()));
        orderPaid.setId("haha");
        orderPaid.setPrice(122);
        orderPaidMapper.save(orderPaid);
    }
}