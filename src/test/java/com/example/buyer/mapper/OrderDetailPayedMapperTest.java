package com.example.buyer.mapper;

import com.example.buyer.object.OrderDetailPayed;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailPayedMapperTest {
    @Autowired
    OrderDetailPayedMapper mapper;
    @Test
    public void save() {
        OrderDetailPayed orderDetailPayed=new OrderDetailPayed();
        orderDetailPayed.setId("111");
        orderDetailPayed.setDate(new Date(System.currentTimeMillis()));
        orderDetailPayed.setPrice(12);
        orderDetailPayed.setName("黑椒牛肉粒");
        System.out.println(orderDetailPayed);
        mapper.save(orderDetailPayed);
    }
}