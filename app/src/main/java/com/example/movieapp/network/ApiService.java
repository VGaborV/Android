package com.example.movieapp.network;

import com.example.movieapp.model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("volley_array.json")
    Call<List<MovieModel>> getMovieList();
}
