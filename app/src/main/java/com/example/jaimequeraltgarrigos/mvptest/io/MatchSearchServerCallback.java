package com.example.jaimequeraltgarrigos.mvptest.io;

import com.example.jaimequeraltgarrigos.mvptest.domain.League;
import com.example.jaimequeraltgarrigos.mvptest.domain.Match;

import java.util.ArrayList;

/**
 * Created by jaimequeraltgarrigos on 5/30/16.
 */
public interface MatchSearchServerCallback extends ServerCallback{

    void onMatchesFound(ArrayList<League> artists);

    void onFailedSearch();

    void firstLeague(League league);
}
