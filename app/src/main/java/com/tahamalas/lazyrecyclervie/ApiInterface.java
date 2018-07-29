package com.tahamalas.lazyrecyclervie;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ApiInterface {
    /******* Posts *******/

    //get all the posts
    @GET("post/1/page/{num}")
    @Headers("Accept: application/json")
    Call<List<NewsResponse>> getNews(@Path("num") int number);
}
