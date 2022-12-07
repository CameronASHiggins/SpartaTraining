package com.sparta.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class CatConverter {

    static ObjectMapper mapper = new ObjectMapper();
    static XmlMapper xmlmapper = new XmlMapper();
    public String ObjectToJson(Cat cat){
        try {
            return mapper.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public String ObjectToXML(Cat cat){
        try {
            return xmlmapper.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public Cat JsonToObject(String s) {
        try {
            return mapper.readValue(s, Cat.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public Cat XMLToObject(String s) {
        try {
            return xmlmapper.readValue(s, Cat.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
