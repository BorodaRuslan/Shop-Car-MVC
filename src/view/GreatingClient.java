package view;

import client.Client;
import controller.ControllerShow;
import model.ModelShowCar;

import java.util.Scanner;

public class GreatingClient implements GreetingsView{
    Client client;
    Scanner scanner = new Scanner(System.in);

    public GreatingClient(Client client) {
        this.client = client;
    }

    @Override
    public int greeating() {
        System.out.println(client.getName() + " Welcome to car shop!");
        System.out.println("""
                ___What do you want to do in our store?___
                
                1. View cars
                2. Buy a car
                
                Please make your choice!
                """);
        return scanner.nextInt();

    }

    public void filterOption(int options){
        switch (options){
            case 1 -> {
                ControllerShow controllerShow = new ControllerShow();
                controllerShow.parkingShow();
            }
            case 2 -> {
                // write logic here
            }
        }
    }


}
