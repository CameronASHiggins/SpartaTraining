package com.sparta;

import jdk.jfr.StackTrace;

import java.io.*;
import java.util.Arrays;

public class CsvFileIO {

    public static void readFile(String fileName){
        final long startTime = System.currentTimeMillis();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(Arrays.toString(line.split(",")));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }

    public static void readWriteFile(String inFile, String outfile){
        try(BufferedReader br = new BufferedReader(new FileReader(inFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outfile))){
            String line;
            while((line = br.readLine()) != null ){

                bw.write(line + "\n");
            }
        }catch (IOException e){
            System.out.println(e.getStackTrace());
        }
    }
}
