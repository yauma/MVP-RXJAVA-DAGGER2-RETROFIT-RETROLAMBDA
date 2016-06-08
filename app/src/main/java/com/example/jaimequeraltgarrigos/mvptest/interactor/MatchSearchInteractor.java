package com.example.jaimequeraltgarrigos.mvptest.interactor;


import com.example.jaimequeraltgarrigos.mvptest.MyConstant;
import com.example.jaimequeraltgarrigos.mvptest.domain.League;
import com.example.jaimequeraltgarrigos.mvptest.io.MatchSearchServerCallback;
import com.example.jaimequeraltgarrigos.mvptest.io.api.MatchServices;
import com.example.jaimequeraltgarrigos.mvptest.io.api.RestApiManager;


import java.util.ArrayList;
import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by jaimequeraltgarrigos on 5/30/16.
 */
public class MatchSearchInteractor {

    private MatchServices service;

    public MatchSearchInteractor(MatchServices service) {
        this.service = service;
        this.service = RestApiManager.getInstance().create(MatchServices.class);
    }

/*    public void fecthAllMatches(final MatchSearchServerCallback callback) {

        service.getMatches().enqueue(new Callback<List<League>>() {
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
    }*/

    public void fecthAllMatches(MatchSearchServerCallback callback) {
        service.getMatches()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(leagues -> {
                            callback.onMatchesFound((ArrayList<League>) leagues);
                        }
                        , throwable -> {
                            callback.onFailedSearch();
                        });
    }

    public void fecthLiveMatches(MatchSearchServerCallback callback) {
        service.getLiveMatch(MyConstant.LIVE)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(leagues -> {
                            callback.onMatchesFound((ArrayList<League>) leagues);
                        }
                        , throwable -> {
                            callback.onFailedSearch();
                        });
    }

    public void fecthFinishedMatches(MatchSearchServerCallback callback) {
        service.getFinidhedMatch(MyConstant.FINISHED)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(leagues -> {
                            callback.onMatchesFound((ArrayList<League>) leagues);
                        }
                        , throwable -> {
                            callback.onFailedSearch();
                        });
    }


}
