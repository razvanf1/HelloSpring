package com.example.HelloSpring.Model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="orders")
@Entity
public class Order {
    @Id
    private String order_no;
    private String user_id;
    private String car_id;
    private String date;
}
