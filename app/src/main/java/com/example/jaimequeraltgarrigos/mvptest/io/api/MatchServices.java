package com.example.jaimequeraltgarrigos.mvptest.io.api;

import com.example.jaimequeraltgarrigos.mvptest.domain.League;

import java.util.List;


import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by jaimequeraltgarrigos on 5/15/16.
 */
public interface MatchServices {
    @GET(MyConstant.URL_GET_MATCH)
    Observable<List<League>> getMatches();

    @GET(MyConstant.URL_GET_MATCH)
    Call<List<League>> getTournament(@Query("tournamentId") int tournamentId);

    @GET(MyConstant.URL_GET_MATCH)
    Call<List<League>> getLiveMatch(@Query("status") String status);

    @GET(MyConstant.URL_GET_MATCH)
    Call<List<League>> getFinidhedMatch(@Query("status") String status);
}

