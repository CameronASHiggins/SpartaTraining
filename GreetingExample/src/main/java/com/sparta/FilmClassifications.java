package com.sparta;

public class FilmClassifications {

    public static String availableClassifications(int ageOfViewer, boolean adultPresent) {
        String result;
        if (ageOfViewer <= 12 && adultPresent == false) {
            result = "U, PG & 12 films are available.";
        } else if ((ageOfViewer <= 12 && adultPresent == true) || (ageOfViewer > 12 && ageOfViewer < 15)) {
            result = "U, PG, 12 & 12A films are available.";
        } else if (ageOfViewer >= 15 && ageOfViewer < 18) {
            return "U, PG, 12, 12A & 15 films are available.";
        } else {
            result = "All films are available.";
        }
        return result;
    }

    public static String availableClassifications(int ageOfViewer) {
        String result;
        System.out.println("If you need an adult to see this film call again with added parameter");
        if (ageOfViewer <= 12) {
            result = "U, PG & 12 films are available.";
        } else if ((ageOfViewer <= 12) || (ageOfViewer > 12 && ageOfViewer < 15)) {
            result = "U, PG, 12 & 12A films are available.";
        } else if (ageOfViewer >= 15 && ageOfViewer < 18) {
            return "U, PG, 12, 12A & 15 films are available.";
        } else {
            result = "All films are available.";
        }
        return result;
    }
}
/*    public static String availableClassifications(int ageOfViewer)
    {
        String result;
        if (ageOfViewer < 12)
        {
            result = "U, PG & 12 films are available.";
        }
        else if (ageOfViewer < 15)
        {
            result = "U, PG, 12 & 15 films are available.";
        }
        else
        {
            result = "All films are available.";
        }
        return result;
        }
*/