package com.sparta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileIO {
    public static void readFile(String fileName){
        final long startTime = System.currentTimeMillis();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }

    public static void readFileCharByChar(String fileName){
        final long startTime = System.currentTimeMillis();

        try (FileReader fr = new FileReader(fileName)){
            int readValue;
            while((readValue = fr.read()) != -1){
                System.out.print((char) readValue);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }
}
