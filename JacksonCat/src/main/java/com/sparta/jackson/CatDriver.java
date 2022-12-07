package com.sparta.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CatDriver {
    public static void main(String[] args) {
        Cat angel = new Cat("Angel", LocalDate.of(2015,3,5),0);
        System.out.println(angel);
        CatConverter cc = new CatConverter();
        System.out.println(cc.ObjectToJson(angel));
//        Cat rogue = new Cat();
//        System.out.println(cc.ObjectToJson(rogue));
        System.out.println(cc.ObjectToXML(angel));
        System.out.println(cc.JsonToObject("{\"name\":\"Angel\",\"dob\":\"05-03-2015\",\"priority\":0}"));
        System.out.println(cc.XMLToObject("<Cat><name>Angel</name><dob>05-03-2015</dob><priority>0</priority></Cat>"));
        Cat rogue = cc.XMLToObject("<Cat><name>Rogue</name><dob>05-03-2015</dob><priority>1</priority></Cat>");
        System.out.println(rogue);
        List<Cat> cats = new ArrayList<>();
        cats.add(angel);
        cats.add(rogue);
        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.writeValueAsString(cats));
            System.out.println(mapper.readValue(mapper.writeValueAsString(cats),
                    List.class));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
