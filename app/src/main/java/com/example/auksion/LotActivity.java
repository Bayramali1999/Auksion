package com.example.auksion;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.auksion.constant.ApiInstance;
import com.example.auksion.data.detail.ConfiscantImagesList;
import com.example.auksion.data.detail.DetailData;
import com.example.auksion.data.detail.LotBean;
import com.example.auksion.data.detail.PostDetailReq;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LotActivity extends AppCompatActivity {

    private LinearLayout mol_mul_item1_hidden;
    private ImageSlider slider;
    private List<ConfiscantImagesList> imagesLists = new ArrayList<>();
    private TextView tvLotID, tvLotName, tvLotCoast, tvLotStartedCoast, tvAukSionPerson,
            tvAukSionFavorite, tvAukSionSee, tvAuksionTypeOfThing, tvLotTimeDiedLine,
            lotTimeDedline, endedTime, auksionUtqaziladiganSana, auksionLocation,
            mol_mul_item1, MolMulVil, MOlMulkTuman, MolMulkManzil,
            MOlMul1Kun, MolMul2kun, MolMulk3Kun;
    private Boolean expendable = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lot);

        ini();

        String lotNum = getIntent().getExtras().getString("lot_num");
        slider = findViewById(R.id.image_slider);

        PostDetailReq req = new PostDetailReq(15, "1.3.7", "uz", lotNum, "true", "1", 0);

        ApiInstance.getApiInstance().getDetails(req).enqueue(new Callback<DetailData>() {
            @Override
            public void onResponse(Call<DetailData> call, Response<DetailData> response) {
                if (response.isSuccessful()) {
                    DetailData body;
                    body = response.body();
                    if (body != null) {
                        LotBean lotBean = body.getLotBean();
                        imagesLists.addAll(lotBean.getConfiscantImagesList());
                        setItemsToSlider();
                        putItemDetailToItem(lotBean);

                    }
                }
            }

            @Override
            public void onFailure(Call<DetailData> call, Throwable t) {
                Log.d("TAG", "onFailure: " + t.getMessage());
            }
        });


    }


    private void ini() {
        tvLotID = findViewById(R.id.tv_lot_id);
        tvLotName = findViewById(R.id.tv_lot_please);
        tvLotCoast = findViewById(R.id.tv_lot_coast);
        tvLotStartedCoast = findViewById(R.id.tv_lot_coast_starter);

        tvAukSionPerson = findViewById(R.id.auksion_person);
        tvAukSionFavorite = findViewById(R.id.auksion_favorit);
        tvAukSionSee = findViewById(R.id.auksion_eye);

        tvAuksionTypeOfThing = findViewById(R.id.auksion_item_name);

        tvLotTimeDiedLine = findViewById(R.id.lot_time_deadline);

        endedTime = findViewById(R.id.lot_deadline);
        auksionUtqaziladiganSana = findViewById(R.id.time_auksion_sasda);
        auksionLocation = findViewById(R.id.location_auksion_sasda);

        mol_mul_item1 = findViewById(R.id.mol_mul_item1);
        mol_mul_item1_hidden = findViewById(R.id.molmulk_hidden);

        MolMulVil = findViewById(R.id.tv_mol_mul_vil);
        MOlMulkTuman = findViewById(R.id.tv_mol_mul_tuman);
        MolMulkManzil = findViewById(R.id.tv_mol_mul_manzil);

        MOlMul1Kun = findViewById(R.id.tv_mol_mul_1kun);
        MolMul2kun = findViewById(R.id.tv_mol_mul_2kun);
        MolMulk3Kun = findViewById(R.id.tv_mol_mul_3kun);

    }

    private void putItemDetailToItem(LotBean lotBean) {
        tvLotID.setText("№ " + lotBean.getId());
        tvLotName.setText(lotBean.getName());

        if (lotBean.getZaklad_summa() != null) {
            int zp = (int) Math.round(lotBean.getZaklad_summa());
            tvLotCoast.setText("Zaklad puli miqdori\n" + zp);
        } else {
            tvLotCoast.setText("Zaklad puli miqdori\n0.0");
        }

        if (lotBean.getStart_price() != null) {
            int sp = (int) Math.round(lotBean.getStart_price());
            tvLotStartedCoast.setText("Boshlang'ich narxi\n" + sp);
        } else {
            tvLotStartedCoast.setText("Boshlang'ich narxi\n0.0");
        }


//        tvAukSionPerson.setText(lotBean.count);
        tvAukSionFavorite.setText(lotBean.getCount_favourite() + "");
        tvAukSionSee.setText(lotBean.getView_count() + "");
        tvAuksionTypeOfThing.setText(lotBean.getConfiscant_categories_name());
        endedTime.setText("Oxirgi sana" + lotBean.getOrder_end_time());
        String endTime = lotBean.getEnd_time().split(" ")[1];
        auksionUtqaziladiganSana.setText("Auksion" + lotBean.getStart_time() + " dan " + endTime);
//        tvLotTimeDiedLine.setText();
        auksionLocation.setText(lotBean.getJoylashgan_manzil());
        String[] MolMul = lotBean.getJoylashgan_manzil().split(", ");
        MolMulVil.setText(MolMul[0] + "");
        MOlMulkTuman.setText(MolMul[1] + "");
        MolMulkManzil.setText(MolMul[2] + "");

        MOlMul1Kun.setText(lotBean.getF_visit_time1());
        MolMul2kun.setText(lotBean.getF_visit_time2());
        MolMulk3Kun.setText(lotBean.getF_visit_time3());

        mol_mul_item1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if (expendable) {
                    mol_mul_item1.setBackground(getResources().getDrawable(R.drawable.bg_selected_style));
                    mol_mul_item1.setTextColor(getResources().getColor(R.color.white));
                    mol_mul_item1_hidden.setVisibility(View.VISIBLE);
                    expendable = false;
                } else {
                    mol_mul_item1.setBackground(getResources().getDrawable(R.drawable.bg_style));
                    mol_mul_item1.setTextColor(getResources().getColor(R.color.black));
                    mol_mul_item1_hidden.setVisibility(View.GONE);
                    expendable = true;
                }

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