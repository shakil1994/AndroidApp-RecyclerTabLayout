package com.example.shakil.androidrecyclertablayout.Common;

import com.example.shakil.androidrecyclertablayout.Interface.RetrofitService;
import com.example.shakil.androidrecyclertablayout.Retrofit.RetrofitClient;

public class Common {
    private static final String BASE_URL = "https://www.simplifiedcoding.net/demos/";

    public static RetrofitService getovies(){
        return RetrofitClient.getRetrofit(BASE_URL).create(RetrofitService.class);
    }
}
