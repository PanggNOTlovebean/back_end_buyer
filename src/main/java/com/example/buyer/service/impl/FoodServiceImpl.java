package com.example.buyer.service.impl;

import com.example.buyer.mapper.FoodMapper;
import com.example.buyer.object.Food;
import com.example.buyer.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl implements FoodService {
    @Autowired
    FoodMapper foodMapper;

    @Override
    public Food findByName(String name) {
        return foodMapper.findByName(name);
    }
}
