package com.example.auksion.api;


import com.example.auksion.data.FilterRequestData;
import com.example.auksion.data.FilterRequestData2;
import com.example.auksion.data.Filters;
import com.example.auksion.data.Lots;
import com.example.auksion.data.RequestLots;
import com.example.auksion.data.detail.Example;
import com.example.auksion.data.detail.PostDetailReq;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HTTP;

public interface Api {

    @HTTP(path = "api/v1/mobile", hasBody = true, method = "POST")
    Call<Lots> getData(@Body RequestLots request);


    @HTTP(path = "api/v1/mobile", hasBody = true, method = "POST")
    Call<Filters> getFilterData(@Body FilterRequestData request);

    @HTTP(path = "api/v1/mobile", hasBody = true, method = "POST")
    Call<Lots> getFilteredData(@Body FilterRequestData2 request);

    @HTTP(path = "api/v1/mobile", hasBody = true, method = "POST")
    Call<Example> getDetails(@Body PostDetailReq ew);


}
