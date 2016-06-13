package com.androidmads.retrofit2mediaupload;

import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PartMap;

/**
 * Created by Mushtaq on 03-06-2016.
 */
public interface ApiConfig {

    @Multipart
    @POST("retrofit_example/upload_image.php")
    Call<ServerResponse> upload(
            @Header("Authorization") String authorization,
            @PartMap Map<String, RequestBody> map
    );
}
