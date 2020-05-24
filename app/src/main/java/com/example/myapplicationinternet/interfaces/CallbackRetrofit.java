package com.example.myapplicationinternet.interfaces;


import com.example.myapplicationinternet.model.GithubUser;

import java.util.List;

public interface CallbackRetrofit {

    public void onResponse(List<GithubUser> githubUserList);
    public void onFailure();
}
