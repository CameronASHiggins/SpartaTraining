package com.sparta;

public class SolarSystem {
    public static void main(String[] args) {
        Planet Earth = Planet.EARTH;

        System.out.println(Earth.getPlanetName() + " is " + Earth.getPlanetDistanceFromSol() + "*10^6 km from the Sun and has a mass of " + Earth.getPlanetMass() + "*10^24 kg" );
    }
}
