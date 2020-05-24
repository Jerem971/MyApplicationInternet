package com.example.myapplicationinternet;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.myapplicationinternet.R;
import com.example.myapplicationinternet.interfaces.CallbackRetrofit;
import com.example.myapplicationinternet.model.GithubUser;
import com.example.myapplicationinternet.retrofitCalls.GithubCall;


import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityRetrofitGithub extends AppCompatActivity implements CallbackRetrofit {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.hello);
        GithubCall.fetchUser(this, "JakeWharton");
    }

    @Override
    public void onResponse(List<GithubUser> githubUserList) {

        Log.d("tag","login = " +githubUserList.get(1).getId());
    }



    @Override
    public void onFailure() {

    }
}
