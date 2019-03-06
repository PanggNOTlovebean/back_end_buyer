package com.example.buyer.service.impl;

import com.example.buyer.mapper.OrderDetailPayedMapper;
import com.example.buyer.object.OrderDetailPaid;
import com.example.buyer.service.OrderDetailPayedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailPayedServiceImpl implements OrderDetailPayedService {
    @Autowired
    OrderDetailPayedMapper orderDetailPayedMapper;

    @Override
    public void save(OrderDetailPaid orderDetailPaid) {
        orderDetailPayedMapper.save(orderDetailPaid);
    }
}
