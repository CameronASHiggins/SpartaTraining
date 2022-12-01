package com.sparta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Person> myList = new ArrayList<>();
//        myList.add(new Person("Cameron","Higgins"));
//        myList.add(new Person("James","Martin"));
//
//        myList.add("Hello");
//        myList.add(new Object());
//        myList.add(new ArrayList<>(List.of(new Person("Clark","Kent"))));
//        System.out.println(myList.get(0).getFirstName());

//        Container<Person> employeeContainer = new Container<>();
//
//        employeeContainer.storeInstance(new Employee("Abdullah","Nazeer"));
////        String str = employeeContainer.retrieveInstance().fire(); this doesn't work without casting to employee because the container is of type person
//        String str = ((Employee)employeeContainer.retrieveInstance()).fire();
//        System.out.println(employeeContainer.retrieveInstance());

//        List<Person> myList = new ArrayList<>();
//        myList.add(new Person("Cameron","Higgins"));
//        myList.add(new Person("Roger","Clark"));
//        myList.add(new Person("James","Martin"));
//        System.out.println(myList);
//        myList.sort(Person::compareTo);
//        System.out.println(myList);

        Integer[] intArr = {1,2,3,4,};
        Character[] charArr = {'a','b','c','d'};
        Overload.printArrayContents(intArr);
        Overload.printArrayContents(charArr);
        Overload.findMax(new Person("James","Martin"),new Person("Roger","Clark"),new Person("Cameron","Higgins"));

    }
}