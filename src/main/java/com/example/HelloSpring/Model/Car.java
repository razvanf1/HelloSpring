package com.example.HelloSpring.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="cars")
@Entity
public class Car {
    @Id
    private Integer car_id;
    private String carname;
    private Float price;
    private Integer quantity;
}
