package com.sparta;

import java.util.Objects;

public final class Customer {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object c) {
        // return true if they refer to the same object
        if (this == c){
            return true;
        }

        // return false if the object is null or object is not of type Customer
        if(!(c instanceof Customer)) {
            return false;
        }

        Customer c2 = (Customer) c;
        return (this.getFirstName().equals(c2.getFirstName()) && this.getLastName().equals(c2.getLastName()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
