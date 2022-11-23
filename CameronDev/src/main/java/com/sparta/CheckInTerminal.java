package com.sparta;

public class CheckInTerminal {

    public String checkInPassenger(String passengerDetails){
        if(passengerCheck(passengerDetails).equals("all is well")){
            return "board please";
        } else{
            return "there is a problem";
        }
    }

    public String passengerCheck(String passengerDetails){
        if(passengerDetails.equals("danger")){
            Main.airportOpen = false;
            return "oh no!";
        } else {
            return "all is well";
        }
    }

    public static void main(String[] args) {
        CheckInTerminal terminal1 = new CheckInTerminal();
        Main.airportOpen = true;
        System.out.println(Main.airportOpen);
        terminal1.passengerCheck("danger");
        System.out.println(Main.airportOpen);
    }

}
