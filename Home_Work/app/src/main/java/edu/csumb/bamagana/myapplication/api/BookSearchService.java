package edu.csumb.bamagana.myapplication.api;
package com.learntodroid.mvvmrestapi.apis;

//import com.learntodroid.mvvmrestapi.models.VolumesResponse;

import edu.csumb.bamagana.myapplication.models.VolumesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BookSearchService {
    @GET("/books/v1/volumes")
    Call<VolumesResponse> searchVolumes(
            @Query("q") String query,
            @Query("inauthor") String author,
            @Query("key") String apiKey
    );

    void searchVolumes(String keyword, String author, String apiKey);

    void enqueue();
}