package com.sparta;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileIO {
    public static void readBinary(String inFile){
//        try(FileInputStream fis = new FileInputStream(inFile)){
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inFile))){
            int theByte;
            while((theByte = bis.read()) != -1){
                System.out.print(theByte);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void readWriteBinary(String inFile,String outFile){
        try(FileInputStream fis = new FileInputStream(inFile);
            FileOutputStream fos = new FileOutputStream(outFile)){
            int theByte;
            while((theByte = fis.read()) != -1){
                System.out.println(theByte);
                fos.write(theByte);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
