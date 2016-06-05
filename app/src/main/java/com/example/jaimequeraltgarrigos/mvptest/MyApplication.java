package com.example.jaimequeraltgarrigos.mvptest;

import android.app.Application;
import android.content.Context;

/**
 * Created by jaimequeraltgarrigos on 5/30/16.
 */
public class MyApplication extends Application {

    AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        setupGraph();
    }

    private void setupGraph() {
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this)).build();
    }

    public AppComponent getComponent() {
        return component;
    }

    public static MyApplication getApp(Context context) {
        return (MyApplication) context.getApplicationContext();
    }
}
