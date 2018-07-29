package com.tahamalas.lazyrecyclervie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.tahamalas.lazyrecyclerview.OnLoadMore;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RecyclerView recyclerView;

    private Retrofit retrofit;

    private ApiInterface service;

    Adapter adapter;

    private List<NewsResponse> newsResponseList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        initRetrofit();

        adapter = new Adapter(newsResponseList);
        getData(0);
        adapter.setOnLoadMore(new OnLoadMore() {
            @Override
            public void onLoadMore(int position) {
                getData(position);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void initRetrofit() {
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BuildConfig.API_URL)
                .build();
        service = retrofit.create(ApiInterface.class);
    }

    private void getData(int position) {
        Log.d(TAG, "getData: " + position);
        service.getNews(position).enqueue(new Callback<List<NewsResponse>>() {
            @Override
            public void onResponse(Call<List<NewsResponse>> call, Response<List<NewsResponse>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    newsResponseList.addAll(response.body());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<NewsResponse>> call, Throwable t) {

            }
        });
    }

}
