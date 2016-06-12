package com.example.jaimequeraltgarrigos.mvptest.ui.activity;

import android.content.Context;
import android.content.Intent;

import com.example.jaimequeraltgarrigos.mvptest.domain.Match;
import com.google.gson.Gson;

/**
 * Created by jaimequeraltgarrigos on 6/12/16.
 */
public class NavigationUtils {


    public static void navigateToDetails(Context context, Object o) {
        Gson gson = new Gson();
        String json = gson.toJson(o, Match.class);
        Intent i = new Intent(context, DetailsActivity.class);
        i.putExtra("match", json);
        context.startActivity(i);

    }
}
