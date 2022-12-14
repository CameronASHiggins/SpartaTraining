package com.sparta.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DummyUserService implements UserService{

    ConsoleGreetingService cgs;
    @Autowired
    DummyUserService(ConsoleGreetingService cgs){
        this.cgs = cgs;
    }
    @Override
    public void greetAll() {
        List<String> dummyList = new ArrayList<>(Arrays.asList("Elodie","Charles"));
        for (String s: dummyList) {
            cgs.greet(s);
        }
    }

}
