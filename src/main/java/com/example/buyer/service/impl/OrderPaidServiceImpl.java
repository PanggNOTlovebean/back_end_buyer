package com.example.buyer.service.impl;

import com.example.buyer.mapper.OrderPaidMapper;
import com.example.buyer.object.OrderPaid;
import com.example.buyer.service.OrderPaidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderPaidServiceImpl implements OrderPaidService {
    @Autowired
    OrderPaidMapper orderPaidMapper;
    @Override
    public void save(OrderPaid order) {
        orderPaidMapper.save(order);
    }
}
