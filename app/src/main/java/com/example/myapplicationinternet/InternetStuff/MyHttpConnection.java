package com.example.myapplicationinternet.InternetStuff;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class MyHttpConnection {

    public static String connectToUrl(String urlName){

        StringBuilder stringBuilder=new StringBuilder();

        try{

            URL url = new URL(urlName);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.connect();
            InputStream in = httpURLConnection.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(in));
            String line="";
            while((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line);
            }
        }catch (Exception  e){

            Log.e("Error",e.getMessage());

        }

        return  stringBuilder.toString();

    }
}
