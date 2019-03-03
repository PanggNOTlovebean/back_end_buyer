package com.example.buyer.service.impl;

import com.example.buyer.mapper.OrderDetailPayedMapper;
import com.example.buyer.object.OrderDetailPayed;
import com.example.buyer.service.OrderDetailPayedService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailPayedServiceImpl implements OrderDetailPayedService {
    @Autowired
    OrderDetailPayedMapper orderDetailPayedMapper;

    @Override
    public void save(OrderDetailPayed orderDetailPayed) {
        orderDetailPayedMapper.save(orderDetailPayed);
    }
}
