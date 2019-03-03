package com.example.buyer.object;

import lombok.Data;

import java.sql.Date;

@Data
public class OrderPaid {
    String id;
    Integer price;
    Date date;
}
