package com.example.jaimequeraltgarrigos.mvptest;

import android.content.Context;

import com.example.jaimequeraltgarrigos.mvptest.io.api.MatchServices;
import com.example.jaimequeraltgarrigos.mvptest.io.api.RestApiManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Retrofit;


/**
 * Created by jaimequeraltgarrigos on 6/1/16.
 */
@Module
public class AppModule {

    MyApplication mApplication;

    public AppModule(MyApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    MyApplication providesApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    public Retrofit provideRetrofitInstance() {
        return RestApiManager.getInstance();
    }

    @Provides
    @Singleton
    public MatchServices provideSpotifyApiService(Retrofit retrofit) {
        return retrofit.create(MatchServices.class);
    }
}
