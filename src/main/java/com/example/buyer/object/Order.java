package com.example.buyer.object;

import lombok.Data;

@Data
public class Order {
    String id;
    String name;
    Integer price;
    Integer buyerId;
}
