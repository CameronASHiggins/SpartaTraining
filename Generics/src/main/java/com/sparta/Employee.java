package com.sparta;

public class Employee extends Person{
    public Employee(String firstName, String lastname) {
        super(firstName, lastname);
    }

    public String fire(){
        return "You're fired!";
    }
}
