package com.sparta;

import org.apache.logging.log4j.*;

public class Main {
    public static void main(String[] args) {
        Logger myLogger = LogManager.getLogger();
//        Calc c1 = new Calc();
//        var a = c1.divide(12.0,0.0);
//        System.out.println((String.valueOf(a) == "Infinity"));
        try {
            throw new newtestException("This is a test exception");
        } catch (newtestException e) {
            myLogger.log(Level.DEBUG, "Caught test exception");
        }
        Starter.start();
    }


}