package com.example.shakil.androidrecyclertablayout.Interface;

import com.example.shakil.androidrecyclertablayout.Model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {
    @GET("marvel")
    Call<List<Movie>> getAllMovies();
}
