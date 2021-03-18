package com.car.shopping.carshoppingdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cars {
    public String location;
    public List<Vehicle> vehicles;
}
