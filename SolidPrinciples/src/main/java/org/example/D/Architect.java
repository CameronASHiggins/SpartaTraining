package org.example.D;

public class Architect implements Worker{
    private String name;

    public Architect(String name){
        this.name = name;
    };

    @Override
    public void doesJob() {

    }

    @Override
    public String getName() {
        return this.name;
    }

}
