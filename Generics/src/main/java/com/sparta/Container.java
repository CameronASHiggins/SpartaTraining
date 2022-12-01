package com.sparta;

public class Container<T extends Person> {
    private T theInstance;

    public void storeInstance(T theValue){
        theInstance = theValue;
    }

    public T retrieveInstance(){
        return theInstance;
    }

}
