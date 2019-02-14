package com.example.buyer.mapper;

import com.example.buyer.object.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMapperTest {
    @Autowired
    OrderMapper mapper;
    @Test
    public void findByBuyerId() {
        System.out.println(mapper.findByBuyerId(22));
    }

    @Test
    public void save() {
        Order order=new Order();
        order.setId("2019021411226");
        order.setBuyerId(503);
        order.setName("溜肥肠");
        order.setPrice(2);
        mapper.save(order);
    }

    @Test
    public void delete() {
        mapper.deleteById("1550158544");
    }

}