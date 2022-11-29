package com.sparta;

public class Cat {
    public String meow(String name){
        try{
            name = name.toUpperCase();
        } catch (NullPointerException e){

        }

        return name + " the cat meows";
    }
}
