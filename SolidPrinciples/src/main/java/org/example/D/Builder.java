package org.example.D;

public class Builder implements Worker{

    private String name;

    public Builder(String name){
        this.name = name;
    }
    @Override
    public void doesJob() {
        System.out.println("This builder does their job.");
    }

    @Override
    public String getName() {
        return this.name;
    }


}
