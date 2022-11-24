package org.example.D;

public class Builder implements Worker{

    private String name;

    public Builder(String name){
        this.name = name;
    }
    @Override
    public void doesJob() {

    }

    @Override
    public String getName() {
        return this.name;
    }


}
