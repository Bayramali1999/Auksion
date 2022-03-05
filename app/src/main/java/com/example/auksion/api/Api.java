package com.example.auksion.api;


import com.example.auksion.data.filter.FilterActionRequestData;
import com.example.auksion.data.filter.GetFilteredReq;
import com.example.auksion.data.filter.FilterActionGetResData;
import com.example.auksion.data.lot.Lots;
import com.example.auksion.data.lot.RequestLots;
import com.example.auksion.data.detail.DetailData;
import com.example.auksion.data.detail.PostDetailReq;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HTTP;

public interface Api {

    @HTTP(path = "api/v1/mobile", hasBody = true, method = "POST")
    Call<Lots> getData(@Body RequestLots request);


    @HTTP(path = "api/v1/mobile", hasBody = true, method = "POST")
    Call<FilterActionGetResData> getFilterData(@Body FilterActionRequestData request);


    @HTTP(path = "api/v1/mobile", hasBody = true, method = "POST")
    Call<Lots> getFilteredData(@Body GetFilteredReq request);


    @HTTP(path = "api/v1/mobile", hasBody = true, method = "POST")
    Call<DetailData> getDetails(@Body PostDetailReq ew);


}
