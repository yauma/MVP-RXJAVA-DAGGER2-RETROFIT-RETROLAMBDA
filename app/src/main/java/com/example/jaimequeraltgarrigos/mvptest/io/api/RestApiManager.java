package com.example.jaimequeraltgarrigos.mvptest.io.api;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jaimequeraltgarrigos on 5/17/16.
 */
public class RestApiManager {
    private MatchServices service;

    public MatchServices getMatchServices() {
        if (service == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(MyConstant.API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            service = retrofit.create(MatchServices.class);
        }
        return service;
    }
}
