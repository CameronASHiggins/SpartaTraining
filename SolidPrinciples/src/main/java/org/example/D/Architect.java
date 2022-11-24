package org.example.D;

public class Architect implements Worker{
    private String name;

    public Architect(String name){
        this.name = name;
    };

    @Override
    public void doesJob() {
        System.out.println("This architect does their job.");
    }

    @Override
    public String getName() {
        return this.name;
    }

}
