package com.car.shopping.carshoppingdemo.service;

import com.car.shopping.carshoppingdemo.model.CarDetailsInfo;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class CarInformationService {


    public List<CarDetailsInfo> getCarInfo(){
        List<CarDetailsInfo> list=getCarInfoService();
        return list;
    }


    private List<CarDetailsInfo> getCarInfoService() {
        try {
            return getCarInfoFromFile("src/main/resources/warehouses.json");
        } catch (IOException e) {
            e.printStackTrace();
            return  Arrays.asList();
        }
    }

    private static List<CarDetailsInfo> getCarInfoFromFile(final String pathName) throws IOException {
        final ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return Arrays.asList(mapper.readValue(new File(pathName), CarDetailsInfo[].class));
    }

}
