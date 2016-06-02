package com.example.jaimequeraltgarrigos.mvptest.interactor;

import android.widget.TextView;

import com.example.jaimequeraltgarrigos.mvptest.domain.League;
import com.example.jaimequeraltgarrigos.mvptest.io.MatchSearchServerCallback;
import com.example.jaimequeraltgarrigos.mvptest.io.api.RestApiManager;
import com.example.jaimequeraltgarrigos.mvptest.presenter.MatchesSearchPresenter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by jaimequeraltgarrigos on 5/30/16.
 */
public class ArtistSearchInteractor {

    private Object mDataItems;
    private RestApiManager mRestApiManager = new RestApiManager();

    public void fetchLeagues(final MatchSearchServerCallback callback) {
        mRestApiManager.getMatchServices().getMatches().enqueue(new Callback<List<League>>() {
            @Override
            public void onResponse(Call<List<League>> call, Response<List<League>> response) {
                if (response.body().isEmpty())
                    callback.onFailedSearch();

                else
                    callback.onMatchesFound((ArrayList<League>) response.body());
            }

            @Override
            public void onFailure(Call<List<League>> call, Throwable t) {
                callback.onServerError();
            }
        });
    }
}
