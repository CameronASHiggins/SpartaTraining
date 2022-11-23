package com.sparta;

public abstract class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    public void delete(){
//        System.out.println("This person has been deleted");
//    }
    public abstract void delete();
}
