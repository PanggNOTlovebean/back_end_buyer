package com.example.buyer.service;

import com.example.buyer.object.Food;

public interface FoodService {
    Food findByName(String name);
}
