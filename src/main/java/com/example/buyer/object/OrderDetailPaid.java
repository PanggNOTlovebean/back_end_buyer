package com.example.buyer.object;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
public class OrderDetailPaid {
    String id;
    String name;
    Integer price;
    Timestamp date;
    String orderId;
}
