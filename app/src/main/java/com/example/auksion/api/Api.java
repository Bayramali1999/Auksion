package com.example.auksion.api;


import com.example.auksion.data.FilterRequestData;
import com.example.auksion.data.Filters;
import com.example.auksion.data.Lots;
import com.example.auksion.data.RequestLots;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HTTP;

public interface Api {

    @HTTP(path = "api/v1/mobile", hasBody = true, method = "POST")
    Call<Lots> getData(@Body RequestLots request);


    @HTTP(path = "api/v1/mobile", hasBody = true, method = "POST")
    Call<Filters> getFilterData(@Body FilterRequestData request);

    @HTTP(path = "api/v1/mobile", hasBody = true, method = "POST")
    Call<Filters> getFilteredData(@Body FilterRequestData request);


}
