package com.example.buyer.object;

import lombok.Data;

import java.sql.Date;

@Data
public class OrderDetailPayed {
    String id;
    String name;
    Integer price;
    Date date;
}
