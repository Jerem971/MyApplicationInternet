package com.example.myapplicationinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplicationinternet.Thearthing.AsyncInternet;
import com.example.myapplicationinternet.interfaces.Listeners;

public class MainActivity extends AppCompatActivity implements Listeners {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AsyncInternet asyncInternet=new AsyncInternet(this);
        asyncInternet.execute();
    }

    @Override
    public void onPreExecute() {

    }

    @Override
    public void onPostExecute() {

    }

    @Override
    public void onProgressUpdate() {

    }

    @Override
    public void doInBackground() {

    }
}
