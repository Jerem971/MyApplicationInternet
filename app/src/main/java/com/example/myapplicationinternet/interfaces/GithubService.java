package com.example.myapplicationinternet.interfaces;

import com.example.myapplicationinternet.model.GithubUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubService {

    public static final String GITHUB_URL_DEFAULT="https://api.github.com/";

    @GET("users/{username}/repos") // appel synchrone
    public List<List<GithubUser>> githubUserListSynchrone(@Path("username") String username);

    @GET("users/{username}/following") // appel asynchrone grace à l'objet Call
    public Call<List<GithubUser>> githubUserListAsynchrone(@Path("username") String username);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(GITHUB_URL_DEFAULT)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


}
