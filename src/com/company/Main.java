package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Train> trains = new ArrayList<>();
        ArrayList<Train> result = new ArrayList<>();
        Train train1 = new Train("Kiev", 153, new BigDecimal(100), 12, 43, 12, 34);
        Train train2 = new Train("Kiev", 123, new BigDecimal(100), 21, 23, 1, 35);
        Train train3 = new Train("Odessa", 111, new BigDecimal(100), 21, 23, 3, 32);

        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        System.out.println("The list of trains:\n");
        for (Train i : trains) {
            System.out.println(i);
        }

        trains.remove(train2);

        System.out.println("The list of trains:\n");
        for (Train i : trains) {
            System.out.println(i);
        }
/*
        System.out.println("Enter the direction;");
        String request = input.next();

        for (Train train : trains) {
            if (train.getDestination_station().equals(request)) {
                result.add(train);
            }
        }
        if (result.isEmpty())
            System.out.println("There are no records in the database for this request");
        else
            System.out.println(result);
        System.out.println("Enter your desired route to get the arrival times of all its trains;");
        request = input.next();
        for (Train train : trains) {
            if (train.getDestination_station().equals(request)) {
                result.add(train);
                System.out.println(train.getTime_of_arrival());
            }
        }
        try {
            result.clear();
            System.out.println("Enter the train number to get the departure time;");
            int request_number = input.nextInt();
            for (Train train : trains) {
                if (train.getTrain_number() == request_number) {
                    result.add(train);
                    System.out.println(train.getTime_of_departure());
                }
            }
        } catch (InputMismatchException exception) {
            System.out.println("Number is set incorrectly");
        }

        */
    }
}
