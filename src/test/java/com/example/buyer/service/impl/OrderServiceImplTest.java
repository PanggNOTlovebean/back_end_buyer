package com.example.buyer.service.impl;

import com.example.buyer.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceImplTest {
    @Autowired
    OrderService orderService;
    @Test
    public void findByBuyerId() {
        System.out.println(orderService.findByBuyerId(22));
    }
}