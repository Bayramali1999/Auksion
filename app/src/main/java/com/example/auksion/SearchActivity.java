package com.example.auksion;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.auksion.constant.ApiInstance;
import com.example.auksion.data.filter.FilterActionGetResData;
import com.example.auksion.data.filter.FilterActionRequestData;
import com.example.auksion.data.filter.FiltersMapForSpinner2;
import com.example.auksion.data.filter_item.AreaData;
import com.example.auksion.data.filter_item.CategoryData;
import com.example.auksion.data.filter_item.DirectionData;
import com.example.auksion.data.filter_item.GroupData;
import com.example.auksion.data.filter_item.RegionData;
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
    private int first = -1, firstID, second = -1, third = -1, fourth = -1;
    private Button clearBtn, searchBtn;
    private boolean hasBody = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        loadData();
        ini();
        checkItems();
        actionWithView();


        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = -1;
                second = -1;
                third = -1;
                fourth = -1;

                actives.setText("Davlat activlari");
                types.setText("Mol-mulk toifasi");
                province.setText("Viloyat");
                area.setText("Tuman");
            }
        });
    }

    private void checkItems() {
        area.setEnabled(false);
        types.setEnabled(false);
    }

    private void loadData() {
        FilterActionRequestData data = new FilterActionRequestData(7, "1.3.7", "uz", 0);
        ApiInstance.getApiInstance().getFilterData(data).enqueue(new Callback<FilterActionGetResData>() {
            @Override
            public void onResponse(Call<FilterActionGetResData> call, Response<FilterActionGetResData> response) {
                if (response.isSuccessful()) {
                    FilterActionGetResData filters = response.body();
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
            public void onFailure(Call<FilterActionGetResData> call, Throwable t) {
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
                        firstID = groupData.get(s).getId();
                        first = s;
                        if (s >= 0) {
                            types.setEnabled(true);
                            actives.setText(groupData.get(s).getName());
                            types.setText("Mol mulk toifasi");
                            second = -1;
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
                    if (groupData.get(first).getId().equals(categoryData.get(i).getConfiscant_groups_id())) {
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
                            area.setText("Tuman");
                            fourth = -1;
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
                    if (regionData.get(third).getId().equals(areaData.get(i).getRegions_id())) {
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

        String id = searchById.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        FiltersMapForSpinner2 forSpinner2 = new FiltersMapForSpinner2();

        if (!TextUtils.isEmpty(id)) {
            forSpinner2.setLot_number(id);
        }

        if (first != -1) {
            forSpinner2.setConfiscant_groups_id(firstID);
        }
        if (second != -1) {
            forSpinner2.setConfiscant_categories_id(second);
        }
        if (third != -1) {
            forSpinner2.setRegions_id(third + 1);
        }
        if (fourth != -1) {
            forSpinner2.setAreas_id(fourth);
        }

        intent.putExtra("search_by_spinner2", forSpinner2);

        startActivity(intent);
        finish();
    }
}