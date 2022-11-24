package sparta;

import java.util.Objects;

public class Customer {
    private String firstName;               // defaults to null
    private String lastName;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    @Override
//    public boolean equals(Object c){
//        // returns true if they refer to the same object
//        if (this == c){
//            return true;
//        }
//        // return false if the object is null or object is not of type Customer
////        if(c == null || this.getClass() != c.getClass()) {
////            return false;
////        }
//        if(!(c instanceof Customer)) {
//            return false;
//        }
//        Customer c1 = (Customer) c;
//        return this.getFirstName().equals(c1.getFirstName()) && this.getLastName().equals(c1.getLastName());
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

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
}
