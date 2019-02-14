package com.example.buyer.service;

import com.example.buyer.object.Order;

import java.util.List;

public interface OrderService {
    List<Order> findByBuyerId(Integer buyerId);
    void save(Order order);
    void deleteById(String id);
    void deleteByBuyerId(String buyerId);
}
