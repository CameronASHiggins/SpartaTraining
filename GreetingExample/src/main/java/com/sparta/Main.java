package com.sparta;

import org.w3c.dom.ls.LSOutput;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LocalTime verboseTime = LocalTime.now();
        DateTimeFormatter verboseTimeFormat = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = verboseTime.format(verboseTimeFormat);
        System.out.println(formattedTime);

        Scanner userInput = new Scanner(System.in);
        int timeOfDay;

        do {
            System.out.print("Please enter a time between 1 and 24: ");
            while (!userInput.hasNextInt()) {
                System.out.println("That's not a valid input");
                System.out.print("Please enter an Integer: ");
                userInput.next();
            }
            timeOfDay = userInput.nextInt();
        } while(timeOfDay > 24 || timeOfDay < 1);

//        int timeOfDay = LocalDateTime.now().getHour();
        System.out.println(greeting(timeOfDay));
    }

    static String greeting(int timeOfDay){
        String greeting;
        if(timeOfDay >= 5 && timeOfDay <= 12){
            greeting = "Good morning!";
        }
        else if (timeOfDay > 12 && timeOfDay <= 18){
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }
        return greeting;
    }

    static String greetingSwitch(int timeOfDay) {
        String greeting = null;
        switch ((timeOfDay >= 5 && timeOfDay <= 12) ? 0 :
                (timeOfDay > 12 && timeOfDay <= 18) ? 1 : 2) {
            case 0:
                greeting = "Good morning!";
                break;
            case 1:
                greeting = "Good afternoon!";
                break;
            case 2:
                greeting = "Good evening!";
                break;
        }
        return greeting;
    }
}
