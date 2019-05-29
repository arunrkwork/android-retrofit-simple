package com.arunrk.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

   // public static final String BASE_URL = "http://192.168.1.100/pos/api/";
    public static final String BASE_URL = "http://192.168.1.100/contactapp/";
    public static Retrofit mRetrofit;

    public static Retrofit getApiClient() {
        if (mRetrofit == null) {

            OkHttpClient.Builder client = new OkHttpClient.Builder();
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            client.addInterceptor(loggingInterceptor);

            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)//.client(client.build())
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return mRetrofit;
    }

}
