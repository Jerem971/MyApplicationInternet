package com.example.myapplicationinternet.Thearthing;

import android.os.AsyncTask;
import android.util.Log;

import com.example.myapplicationinternet.InternetStuff.MyHttpConnection;
import com.example.myapplicationinternet.interfaces.Listeners;

public class AsyncInternet extends AsyncTask<Void,Void,Boolean> {

    Listeners listeners;

    public AsyncInternet (Listeners listeners){
        this.listeners = listeners;
    }
    @Override
    protected Boolean doInBackground(Void... voids) {
        listeners.doInBackground();
        return true;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        listeners.onPreExecute();
        Log.d("TAG", "AsyncTask is started.");
    }

    @Override
    protected void onPostExecute(Boolean aBool) {
        super.onPostExecute(aBool);
        listeners.onPostExecute();

        Log.d("TAG", "AsyncTask is finished.");
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
        listeners.onProgressUpdate();
        Log.d("TAG", "AsyncTask is progressing.");
    }
}
