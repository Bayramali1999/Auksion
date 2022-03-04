package com.example.auksion;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.auksion.constant.ApiInstance;
import com.example.auksion.data.AreaData;
import com.example.auksion.data.CategoryData;
import com.example.auksion.data.DirectionData;
import com.example.auksion.data.FilterMap;
import com.example.auksion.data.FilterRequestData;
import com.example.auksion.data.FilterRequestData2;
import com.example.auksion.data.Filters;
import com.example.auksion.data.GroupData;
import com.example.auksion.data.RegionData;
import com.example.auksion.dialog.ActiveDialog;
import com.example.auksion.listener.OnItemSelected;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchActivity extends AppCompatActivity {

    private ImageView back;
    private List<AreaData> areas = new ArrayList<>();
    private List<CategoryData> typ = new ArrayList<>();
    private EditText searchById;
    private TextView actives, types, province, area;
    private List<RegionData> regionData = new ArrayList<>();
    private List<AreaData> areaData = new ArrayList<>();
    private List<CategoryData> categoryData = new ArrayList<>();
    private List<GroupData> groupData = new ArrayList<>();
    private List<DirectionData> directionData = new ArrayList<>();
    private ActiveDialog dialog;
    private int first = -1, second = -1, third = -1, fourth = -1;
    private Button clearBtn, searchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        loadData();
        ini();
        checkItems();
        actionWithView();
    }

    private void checkItems() {
        area.setEnabled(false);
        types.setEnabled(false);
    }

    private void loadData() {
        FilterRequestData data = new FilterRequestData(7, "1.3.7", "uz", 0);
        ApiInstance.getApiInstance().getFilterData(data).enqueue(new Callback<Filters>() {
            @Override
            public void onResponse(Call<Filters> call, Response<Filters> response) {
                if (response.isSuccessful()) {
                    Filters filters = response.body();
                    if (filters != null) {
                        regionData.addAll(filters.getRegions());
                        areaData.addAll(filters.getAreas());
                        categoryData.addAll(filters.getCategories());
                        groupData.addAll(filters.getGroups());
                        directionData.addAll(filters.getDirections());
                    }
                }
            }

            @Override
            public void onFailure(Call<Filters> call, Throwable t) {
                Log.d("TAGS", "onFailure: " + t.getMessage());
            }
        });
    }

    private void actionWithView() {

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        actives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                OnItemSelected selected = new OnItemSelected() {
                    @Override
                    public void itemSelected(int s) {
                        first = s;
                        if (s >= 0) {
                            types.setEnabled(true);
                            actives.setText(groupData.get(s).getName());
                        }
                    }
                };
                String active[] = new String[groupData.size()];
                for (int i = 0; i < groupData.size(); i++) {
                    active[i] = groupData.get(i).getName();

                }
                dialog.getData("Mulk guruxlari", active, selected);
                dialog.show(getFragmentManager(), "dasdas");

            }
        });

        types.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typ.clear();
                for (int i = 0; i < categoryData.size(); i++) {
                    if (groupData.get(first).getId() == categoryData.get(i).getConfiscant_groups_id()) {
                        typ.add(categoryData.get(i));
                    }
                }


                OnItemSelected selected = new OnItemSelected() {
                    @Override
                    public void itemSelected(int s) {
                        second = typ.get(s).getId();
                        types.setText(typ.get(s).getName());
                    }
                };
                String[] are = new String[typ.size()];

                for (int i = 0; i < typ.size(); i++) {
                    are[i] = typ.get(i).getName();
                }

                dialog.getData("Mol-mulk toifasi", are, selected);
                dialog.show(getFragmentManager(), "dasdas");
            }
        });

        province.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnItemSelected selected = new OnItemSelected() {
                    @Override
                    public void itemSelected(int s) {
                        third = s;
                        if (s >= 0) {
                            area.setEnabled(true);
                            province.setText(regionData.get(s).getName());
                        }
                    }
                };
                String[] regions = new String[regionData.size()];
                for (int r = 0; r < regionData.size(); r++) {
                    regions[r] = regionData.get(r).getName();
                }
                dialog.getData("Viloyat", regions, selected);
                dialog.show(getFragmentManager(), "dasdas");
            }
        });

        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                areas.clear();

                for (int i = 0; i < areaData.size(); i++) {
                    if (regionData.get(third).getId() == areaData.get(i).getRegions_id()) {
                        areas.add(areaData.get(i));
                    }
                }

                OnItemSelected selected = new OnItemSelected() {
                    @Override
                    public void itemSelected(int s) {
                        fourth = areas.get(s).getId();
                        area.setText(areas.get(s).getName());
                    }
                };

                String[] are = new String[areas.size()];

                for (int i = 0; i < areas.size(); i++) {
                    are[i] = areas.get(i).getName();
                }
                dialog.getData("Mol-mulk toifasi", are, selected);

                dialog.show(getFragmentManager(), "dasdas");
            }
        });

    }

    private void ini() {

        clearBtn = findViewById(R.id.btn_clear);
        searchBtn = findViewById(R.id.btn_search_item);
        back = findViewById(R.id.back_arrow);
        searchById = findViewById(R.id.search_by_id);
        actives = findViewById(R.id.spinner_actives);
        types = findViewById(R.id.spinner_type);
        province = findViewById(R.id.spinner_province);
        area = findViewById(R.id.spinner_area);

        dialog = new ActiveDialog();


        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchItemsByClick();
            }
        });
    }

    private void searchItemsByClick() {
        FilterMap filterMap = new FilterMap();
        if (first != -1) {
            filterMap.setConficant_groups_id(first);

        }
        if (second != -1) {
            filterMap.setConficant_categories_id(second);
        }
        if (third != -1) {
            filterMap.setRegions_id(third);
        }
        if (fourth != -1) {
            filterMap.setAreas_id(fourth);
        }

        String number = searchById.getText().toString();

//        if (!TextUtils.isEmpty(number)) {
//            int foo = Integer.parseInt(number);
////            filterMap.setLot_number(foo);
//        }


        int lot_number = 1395606;
        FilterRequestData2 data2 = new FilterRequestData2(5, "1.3.7", "uz", 0, "0", lot_number);
        Toast.makeText(this, data2.toString(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(SearchActivity.this, MainActivity.class);
        intent.putExtra("data2", data2);
        startActivity(intent);
    }
}