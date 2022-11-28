package com.sparta;

public enum Planet {
    EARTH("Earth",149.6f,5.97f),
    MARS("Mars",228.0f,0.642f),
    JUPITER("Jupiter",778.5f,1898.0f),
    SATURN("Saturn",1432.0f,568.0f),
    VENUS("Venus",108.2f,4.87f),
    MERCURY("Mercury",57.9f,0.33f),
    NEPTUNE("Neptune",4515.0f,102.0f),
    URANUS("Uranus",2867.0f,86.8f);

    private final String planetName;
    private final Float planetDistanceFromSol;
    private final Float planetMass;
    private Planet(String planetName, Float planetDistanceFromSol, Float planetMass){
        this.planetName = planetName;
        this.planetDistanceFromSol = planetDistanceFromSol;
        this.planetMass = planetMass;
    }

    public String getPlanetName(){
        return planetName;
    }

    public Float getPlanetDistanceFromSol(){ return planetDistanceFromSol; }

    public Float getPlanetMass(){ return planetMass; }
}
