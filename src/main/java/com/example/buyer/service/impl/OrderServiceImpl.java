package com.example.buyer.service.impl;

import com.example.buyer.object.Order;
import com.example.buyer.mapper.OrderMapper;
import com.example.buyer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<Order> findByBuyerId(Integer buyerId) {
        return orderMapper.findByBuyerId(buyerId);
    }

    @Override
    public void save(Order order) {
        orderMapper.save(order);
    }

    @Override
    public void deleteById(String id) {
        orderMapper.deleteById(id);
    }

    @Override
    public void deleteByBuyerId(String buyerId) {
        orderMapper.deleteByBuyerId(buyerId);
    }
}
