package com.car.shopping.carshoppingdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

    public int _id;
    public String make;
    public String model;
    public int year_model;
    public double price;
    public boolean licensed;
    public String date_added;
}
