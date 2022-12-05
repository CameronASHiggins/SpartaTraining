package com.sparta;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MySorter <T> {
//    public class CustomerComparator implements Comparator<Customer> {
//
//        @Override
//        public int compare(Customer o1, Customer o2) {
//            return o2.getLastName().compareTo(o1.getLastName());
//        }
//    }

    public <T extends Comparable<T>> void sort(List theList){
        Collections.sort(theList);
    }

    public void sortCustomers(List<Customer> theList){
//        CustomerComparator customerComparator = new CustomerComparator();
        Collections.sort(theList, (o1,o2) -> o2.getLastName().compareTo(o1.getLastName()));
    }
        //This ^ is the same as that :
//        Collections.sort(theList, new Comparator<Customer>(){
//            public int compare(Customer o1, Customer o2) {
//                return o2.getLastName().compareTo(o1.getLastName());
//            }
//        });
}
