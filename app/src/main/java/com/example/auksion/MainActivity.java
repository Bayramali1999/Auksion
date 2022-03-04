package com.example.auksion;

import android.annotation.SuppressLint;
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
import com.example.auksion.constant.ApiInstance;
import com.example.auksion.data.filter.FiltersMapForSpinner2;
import com.example.auksion.data.filter.GetFilteredReq;
import com.example.auksion.data.lot.LotData;
import com.example.auksion.data.lot.Lots;
import com.example.auksion.data.lot.RequestLots;
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
    private int page = 0;
    private boolean searchByLotId = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ini();


    }

    private void loadData() {
        String myPage = page + "";

        RequestLots req = new RequestLots(5, "1.3.7", "uz", myPage, 0);

        ApiInstance.getApiInstance().getData(req).enqueue(new Callback<Lots>() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(Call<Lots> call, Response<Lots> response) {
                if (response.isSuccessful()) {
                    Lots lots = response.body();
                    if (lots != null) {
                        dataArrayList.addAll(lots.getShortLotBeans());
                        adapter.notifyDataSetChanged();
                        progressBar.setVisibility(View.GONE);
                    }
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
                intent.putExtra("lot_num", data.getLot_number());
                startActivity(intent);
            }
        };

        adapter = new MyAdapter(dataArrayList, this, listener);
        recyclerView.setAdapter(adapter);
    }


    @Override
    protected void onResume() {
        super.onResume();


        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {

                FiltersMapForSpinner2 filters_map = bundle.getParcelable("search_by_spinner2");

                if (filters_map != null) {
                    searchByLotId = true;
                    GetFilteredReq req = new GetFilteredReq(5, "1.3.7", "1", "uz", 0, filters_map);
                    ApiInstance.getApiInstance().getFilteredData(req).enqueue(new Callback<Lots>() {
                        @Override
                        public void onResponse(Call<Lots> call, Response<Lots> response) {
                            if (response.isSuccessful()) {
                                Lots body = response.body();
                                if (body != null) {
                                    dataArrayList.clear();
                                    dataArrayList.addAll(body.getShortLotBeans());
                                    adapter.notifyDataSetChanged();
                                    progressBar.setVisibility(View.GONE);
                                }
                            }
                        }

                        @Override
                        public void onFailure(Call<Lots> call, Throwable t) {

                        }
                    });
                }
//                String lot_number = bundle.getString("search_by_id", null);
//                if (lot_number != null) {
//                    searchByLotId = true;
//                    FiltersMap filters_map = new FiltersMap(lot_number);
//                    GetFilteredReq req = new GetFilteredReq(5, "1.3.7", "1", "uz", 0, filters_map);
//                    Log.d("search", "searchItemsByClick: " + req.toString());
//                    ApiInstance.getApiInstance().getFilteredData(req).enqueue(new Callback<Lots>() {
//                        @SuppressLint("NotifyDataSetChanged")
//                        @Override
//                        public void onResponse(Call<Lots> call, Response<Lots> response) {
//                            if (response.isSuccessful()) {
//                                dataArrayList.clear();
//                                dataArrayList.addAll(response.body().getShortLotBeans());
//                                adapter.notifyDataSetChanged();
//                                progressBar.setVisibility(View.GONE);
//
//                            }
//                        }
//
//                        @Override
//                        public void onFailure(Call<Lots> call, Throwable t) {
//                            Log.d("search", "onFailure: " + t.getMessage());
//                        }
//                    });
//                }
//
//                FiltersMapForSpinner filters_map = bundle.getParcelable("search_by_spinner");
//
//                if (filters_map != null) {
//                    searchByLotId = true;
//                    Log.d("forSpinner", "onResume: " + filters_map);
//
//                    GetFilteredReq req = new GetFilteredReq(5, "1.3.7", "0", "uz", 0, filters_map);
//                    ApiInstance.getApiInstance().getFilteredData(req).enqueue(new Callback<Lots>() {
//                        @Override
//                        public void onResponse(Call<Lots> call, Response<Lots> response) {
//                            if (response.isSuccessful()) {
//                                Lots body = response.body();
//                                if (body.getShortLotBeans() != null) {
//                                    dataArrayList.clear();
//                                    dataArrayList.addAll(body.getShortLotBeans());
//                                    adapter.notifyDataSetChanged();
//                                    progressBar.setVisibility(View.GONE);
//                                }
//                            }
//                        }
//
//                        @Override
//                        public void onFailure(Call<Lots> call, Throwable t) {
//                            Log.d("forSpinner", "onFailure: " + t.getMessage());
//                        }
//                    });
//
//                }
            }
        }
        scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

                if (scrollY == v.getChildAt(0).getMeasuredHeight() - v.getMeasuredHeight() && !searchByLotId) {
                    page++;
                    progressBar.setVisibility(View.VISIBLE);
                    loadData();
                }
            }
        });


        if (!searchByLotId) {
            loadData();
        }

    }
}