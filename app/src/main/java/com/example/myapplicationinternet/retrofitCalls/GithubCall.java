package com.example.myapplicationinternet.retrofitCalls;

import com.example.myapplicationinternet.interfaces.CallbackRetrofit;
import com.example.myapplicationinternet.interfaces.GithubService;
import com.example.myapplicationinternet.model.GithubUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GithubCall {

    CallbackRetrofit callbackRetrofit;
    public static final String FOLDER_USERNAME = "JakeWharton";

    public static void fetchUser(final CallbackRetrofit callbackRetrofit, String username){

        GithubService githubService = GithubService.retrofit.create(GithubService.class);
        Call<List<GithubUser>> githubUserList = githubService.githubUserListAsynchrone(username);
        githubUserList.enqueue(new Callback<List<GithubUser>>() {
            @Override
            public void onResponse(Call<List<GithubUser>> call, Response<List<GithubUser>> response) {

                callbackRetrofit.onResponse(response.body());
            }

            @Override
            public void onFailure(Call<List<GithubUser>> call, Throwable t) {

                callbackRetrofit.onFailure();
            }
        });
    }

}
