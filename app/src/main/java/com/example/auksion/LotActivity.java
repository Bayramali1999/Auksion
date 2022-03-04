package com.example.auksion;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.auksion.constant.ApiInstance;
import com.example.auksion.data.detail.ConfiscantImagesList;
import com.example.auksion.data.detail.Example;
import com.example.auksion.data.detail.PostDetailReq;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LotActivity extends AppCompatActivity {

    private ImageSlider slider;
    private List<ConfiscantImagesList> imagesLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lot);

        String lotNum = getIntent().getExtras().getString("lot_num");
        slider = findViewById(R.id.image_slider);

        PostDetailReq req = new PostDetailReq(15, "1.3.7", "uz", lotNum, "true", "1", 0);

        ApiInstance.getApiInstance().getDetails(req).enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.isSuccessful()) {
                    Example body = response.body();
                    if (body != null) {
                        imagesLists.addAll(body.getLotBean().getConfiscantImagesList());
                        setItemsToSlider();
                    }
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("TAG", "onFailure: " + t.getMessage());
            }
        });



    }

    private void setItemsToSlider() {
        List<SlideModel> all = new ArrayList<>();
        for (int i = 0; i < imagesLists.size(); i++) {
            SlideModel slideModel = new SlideModel(getSlidesUrl(imagesLists.get(i).getFile_hash()), "");
            all.add(slideModel);
        }
        slider.setImageList(all, true);
    }

    private String getSlidesUrl(String file_hash) {
        return "https://files.e-auksion.uz/files-worker/api/v1/images?file_hash=" + file_hash;
    }
}