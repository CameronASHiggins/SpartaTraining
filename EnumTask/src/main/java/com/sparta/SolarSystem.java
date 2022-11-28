package com.sparta;

import java.util.Arrays;

public class SolarSystem {
    public static void main(String[] args) {
        Planet Earth = Planet.EARTH;
        Planet Planets[] = Planet.values();
        System.out.println(Arrays.toString(Planets));
        Planet Mars = Planet.MARS;
        if(!(Earth.getPlanetName() == Mars.getPlanetName())){
            System.out.println("Earth is not named Mars");
        }

        System.out.println(2.0 == 2);

        System.out.println(Earth.getPlanetName() + " is " + Earth.getPlanetDistanceFromSol() + "*10^6 km from the Sun and has a mass of " + Earth.getPlanetMass() + "*10^24 kg" );
    }
}
