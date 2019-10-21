package com.zipcodewilmington.scientificcalculator;
import java.io.*;
import java.net.*;
public class ExtraFeature {
    public static String getBestScoringWords(String query) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL("https://scrabble-cheat-flask-api.herokuapp.com/words/" + query);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();

        return result.toString();
    }

//    public static void main(String[] args) throws Exception
//    {
//        System.out.println(getBestScoringWords("WESTERN"));
//    }

}
