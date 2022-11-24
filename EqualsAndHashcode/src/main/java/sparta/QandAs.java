package sparta;

import static java.lang.System.identityHashCode;

public class QandAs {
    public static void run(){
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj2;

//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
//        System.out.println(obj3.hashCode());


//        String str1 = new String("Tony");   // String Object stored on the heap
//        String str2 = new String("Tony");
//        String str3 = "Tony";                       // String literal
//        String str4 = "Tony";

//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
//        System.out.println(str3.hashCode());
//        System.out.println(str4.hashCode());

//        System.out.println(str4 == str3);
//        System.out.println(str1.equals(str2));



        /**
         * identityHashCode()
         *          - static method
         *          - cannot be overridden
         *          - String class hashCode() method performs differently
         */

//        Object obj5 = new Object();
//        Object obj6 = new Object();
//        Object obj7 = obj6;

//        System.out.println(identityHashCode(obj5));
//        System.out.println(identityHashCode(obj6));
//        System.out.println(identityHashCode(obj7));


        String str1 = new String("Tony");   // String Object stored on the heap
        String str2 = new String("Tony");
        String str3 = "Tony";                       // String literal
//        String str4 = "Tony";
        String str4 = str3;

        System.out.println(identityHashCode(str1));
        System.out.println(identityHashCode(str2));
        System.out.println(identityHashCode(str3));
        System.out.println(identityHashCode(str4));
    }
}
