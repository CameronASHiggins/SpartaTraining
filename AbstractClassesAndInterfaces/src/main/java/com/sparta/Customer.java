package com.sparta;

public class Customer extends Person{

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void delete() {
        System.out.println("This customer has closed their account");
    }
}
