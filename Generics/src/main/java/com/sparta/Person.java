package com.sparta;

public class Person implements Comparable<Person> {
    String firstname;
    String lastName;

    public Person(String firstName, String lastname){
        this.firstname = firstName;
        this.lastName = lastname;
    }

    public String getFirstName(){
        return firstname;
    }

    public String getLastName(){
        return lastName;
    }


    @Override
    public String toString() {
        return firstname + " " + lastName;
    }

    @Override
    public int compareTo(Person o) {
        if (Integer.valueOf(this.lastName.charAt(0)) > Integer.valueOf(o.lastName.charAt(0))) {

            // if current object is greater,then return 1
            return 1;
        }
        else if (Integer.valueOf(this.lastName.charAt(0)) < Integer.valueOf(o.lastName.charAt(0))) {

            // if current object is greater,then return -1
            return -1;
        }
        else {

            // if current object is equal to o,then return 0
            return 0;
        }
    }

}
