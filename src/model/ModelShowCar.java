package model;

import client.Client;

import java.util.List;

public class ModelShowCar implements ModelBusinessLogic{

    List<String> list = List.of("Audi", "Mazda", "Mercedes", "Tesla", "VAZ21-01");
    StringBuilder stringBuilder = new StringBuilder();
    @Override
    public void showCarParking() {
        int count = 1;
        for (String car: list){
            stringBuilder.append(count).append(": ").append(car).append("\n");
            count++;
        }

        System.out.println(stringBuilder.toString());


    }
}
