package com.car.shopping.carshoppingdemo.controller;

import com.car.shopping.carshoppingdemo.model.CarDetailsInfo;
import com.car.shopping.carshoppingdemo.service.CarInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carInfo")
public class CarInformationController {
    @Autowired
    private CarInformationService carInformationService;

    @GetMapping("/fetch")
    public List<CarDetailsInfo> fetchCarInfo(){
        return carInformationService.getCarInfo();
    }
}
