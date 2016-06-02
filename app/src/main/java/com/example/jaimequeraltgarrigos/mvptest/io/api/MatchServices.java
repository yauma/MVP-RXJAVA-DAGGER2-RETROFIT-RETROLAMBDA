package com.example.jaimequeraltgarrigos.mvptest.io.api;

import com.example.jaimequeraltgarrigos.mvptest.domain.League;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jaimequeraltgarrigos on 5/15/16.
 */
public interface MatchServices {
    @GET(MyConstant.URL_GET_MATCH)
    Call<List<League>> getMatches();

    @GET(MyConstant.URL_GET_MATCH)
    Call<List<League>> getTournament(@Query("tournamentId") int tournamentId);

    @GET(MyConstant.URL_GET_MATCH)
    Call<List<League>> getLiveMatch(@Query("status") String status);

    @GET(MyConstant.URL_GET_MATCH)
    Call<List<League>> getFinidhedMatch(@Query("status") String status);
}

