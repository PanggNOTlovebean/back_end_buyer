package com.example.buyer.object;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
public class OrderPaid {
    String id;
    Integer price;
    Timestamp date;
}
