package sparta;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("Craig", "Wroe");
        Customer c2 = new Customer("Craig", "Wroe");
        Customer c3 = new Customer("Craig", "Wroe");
        Customer c4 = new Customer("Ignas", "Stepura");

        if (c1.equals(c3)) {
            System.out.println("These are the same customer");
        } else {
            System.out.println("These are not the same customer");
        }
//
//        if (c1 == c2) {                                         // are these references pointing to the same object
//                                                                // i.e. the same location in memory
//            System.out.println("These are the same customer");
//        } else {
//            System.out.println("These are not the same customer");      // these are not the same object
//        }

            // test the equals() contract
            // reflexive
//        System.out.println(c1.equals(c1));

            // test the hashcode() contract
//        System.out.println(c1.hashCode() + " " + c2.hashCode());

            QandAs.run();
    }
}