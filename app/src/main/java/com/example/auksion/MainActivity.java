package com.example.auksion;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.auksion.adapter.MyAdapter;
import com.example.auksion.api.Api;
import com.example.auksion.constant.ApiInstance;
import com.example.auksion.data.LotData;
import com.example.auksion.data.Lots;
import com.example.auksion.data.RequestLots;
import com.example.auksion.listener.OnIteClickListener;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private NestedScrollView scrollView;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private ArrayList<LotData> dataArrayList = new ArrayList<>();
    private OnIteClickListener listener;
    private MyAdapter adapter;
    private Button sortBtn, searchBtn;
    private Api api;
    private int page = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ini();


        loadData();
        scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

                if (scrollY == v.getChildAt(0).getMeasuredHeight() - v.getMeasuredHeight()) {

                    page++;
                    progressBar.setVisibility(View.VISIBLE);
                    loadData();
                }
            }
        });
    }

    private void loadData() {
        String myPage = page + "";

        RequestLots req = new RequestLots(5, "1.3.7", "uz", myPage, 0);
        ApiInstance.getApiInstance().getData(req).enqueue(new Callback<Lots>() {
            @Override
            public void onResponse(Call<Lots> call, Response<Lots> response) {
                if (response.isSuccessful()) {
                    Lots lots = response.body();
                    if (lots != null) {
                        dataArrayList.addAll(lots.getShortLotBeans());
                        adapter.notifyDataSetChanged();
                        progressBar.setVisibility(View.GONE);
                    }
                    Log.d("TAG", "onResponse: " + lots.toString());
                }
            }

            @Override
            public void onFailure(Call<Lots> call, Throwable t) {
                Log.d("TAG", "fail: " + t.getMessage());
                progressBar.setVisibility(View.GONE);
            }
        });
    }

    private void ini() {
        scrollView = findViewById(R.id.scroll_view);
        recyclerView = findViewById(R.id.recycler_view);
        progressBar = findViewById(R.id.progress_bar);

        sortBtn = findViewById(R.id.btn_sort);
        searchBtn = findViewById(R.id.btn_search);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        listener = new OnIteClickListener() {
            @Override
            public void itemClicked(LotData data) {
                Intent intent = new Intent(MainActivity.this, LotActivity.class);
                startActivity(intent);
            }
        };

        adapter = new MyAdapter(dataArrayList, this, listener);
        recyclerView.setAdapter(adapter);

    }
}