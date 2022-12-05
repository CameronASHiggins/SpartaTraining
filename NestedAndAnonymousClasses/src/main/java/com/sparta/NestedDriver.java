package com.sparta;

import java.util.ArrayList;
import java.util.List;

public class NestedDriver {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("Cameron Higgins", "Abdullah Nazeer"));

        System.out.println(l);
        MySorter theSorter = new MySorter();
        theSorter.sort(l);
//        System.out.println(l);

        List<Customer> custList = new ArrayList<>(List.of(new Customer("Cameron","Higgins"), new Customer("Abdullah","Nazeer"), new Customer("Roger","Clark")));
        System.out.println(custList);
        theSorter.sort(custList);
        System.out.println(custList);


        MySorter<Customer> theCustomerSorter = new MySorter<>();
        theCustomerSorter.sortCustomers(custList);
        System.out.println(custList);
    }
}
