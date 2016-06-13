package com.androidmads.retrofit2mediaupload;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mushtaq on 03-06-2016.
 */
public class AppConfig {

    public static String BASE_URL = "http://mushtaq.16mb.com/";

    public static Retrofit getRetrofit() {

        return new Retrofit.Builder()
                .baseUrl(AppConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
