package com.example.auksion.constant;

import com.example.auksion.api.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiInstance {

    public static Api api = null;

    public static Api getApiInstance() {
        if (api == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://mobile.e-auksion.uz/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            api = retrofit.create(Api.class);
        }
        return api;
    }
}
