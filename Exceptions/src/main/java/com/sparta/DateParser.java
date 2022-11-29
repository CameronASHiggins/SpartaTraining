package com.sparta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {
    Date result = null;
    public Date convertToDate(String s){
        try {
            result = new SimpleDateFormat("yyyy-MM-dd").parse(s);
        }
        catch (ParseException pe) {
            pe.printStackTrace();
            System.out.println("Please enter a valid date format");
            result = null;
        }
        catch (NullPointerException npe){
            npe.printStackTrace();
            result = null;
        }
        finally {
            System.out.println("This will always be printed regardless");
            return result;
        }
    }
}
