package com.car.shopping.carshoppingdemo.model;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDetailsInfo {
    public String _id;
    public String name;
    public Location location;
    public Cars cars;
}
