package org.sha;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        URL url =null ;
        HttpURLConnection connection =null;
        int responseCode =0;
        String urlString ="https://api.zippopotam.us/us/33161";
        try {
            url= new URL(urlString);
        } catch (MalformedURLException e) {
            //throw new RuntimeException(e);
            System.out.print("can not run");
        }
        try {
            connection = (HttpURLConnection) url.openConnection();
            responseCode =connection.getResponseCode();
        } catch (IOException e) {
            System.out.println("connection probleam");
        }
        if(responseCode==200){
            BufferedReader in =new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder apiDate=new StringBuilder();
            String readline=null;

            while((readline=in.readLine())!=null){
                apiDate.append(readline);
            }
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            JSONObject jsonAPIResponce=new JSONObject(apiDate.toString());
            System.out.println(jsonAPIResponce.get("places"));
        }else{
            System.out.println("API call could not be made");
        }
    }
}