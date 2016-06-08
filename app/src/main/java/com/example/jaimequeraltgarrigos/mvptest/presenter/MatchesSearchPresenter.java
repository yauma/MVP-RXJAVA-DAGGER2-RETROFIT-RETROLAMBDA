package com.example.jaimequeraltgarrigos.mvptest.presenter;

import com.example.jaimequeraltgarrigos.mvptest.MyConstant;
import com.example.jaimequeraltgarrigos.mvptest.common.BasePresenter;
import com.example.jaimequeraltgarrigos.mvptest.domain.League;
import com.example.jaimequeraltgarrigos.mvptest.domain.Match;
import com.example.jaimequeraltgarrigos.mvptest.interactor.MatchSearchInteractor;
import com.example.jaimequeraltgarrigos.mvptest.io.MatchSearchServerCallback;
import com.example.jaimequeraltgarrigos.mvptest.ui.viewmodel.MatchSearchView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pedro Antonio Hernández on 13/06/2015.
 */
public class MatchesSearchPresenter extends BasePresenter implements MatchSearchServerCallback {

    public static final String LOG_TAG = MatchesSearchPresenter.class.getSimpleName();

    MatchSearchView searchView;
    MatchSearchInteractor searchInteractor;
    private ArrayList<Object> mDataItems;

    public MatchesSearchPresenter(MatchSearchView searchView) {
        this.searchView = searchView;
    }

    public MatchesSearchPresenter(MatchSearchView view, MatchSearchInteractor interactor) {
        searchView = view;
        searchInteractor = interactor;
    }

    @Override
    public void onStart() {
        searchView.setupAdapter();
        searchView.setupList();
    }

    @Override
    public void onStop() {

    }

    public void searchMatches(String query) {
        if (query.equals(MyConstant.ALL)) {
            searchInteractor.fecthAllMatches(this);
        } else if (query.equals(MyConstant.LIVE)){
            searchInteractor.fecthLiveMatches(this);
        }else{
            searchInteractor.fecthFinishedMatches(this);
        }

    }


    @Override
    public void onMatchesFound(ArrayList<League> artists) {
        searchView.displayFoundMatches(parseResponseForAdapter(artists));
    }

    @Override
    public void onFailedSearch() {

    }

    @Override
    public void firstLeague(League league) {
        int i = 0;
    }

    @Override
    public void onNetworkError() {

    }

    @Override
    public void onServerError() {

    }

    private ArrayList<Object> parseResponseForAdapter(List<League> leaguesList) {
        mDataItems = new ArrayList<>();
        for (League league : leaguesList) {
            String leagueName = league.getName();
            mDataItems.add(leagueName);
            List<Match> matches = league.getMatches();
            for (Match match : matches) {
                mDataItems.add(match);
            }
        }
        return mDataItems;
    }

}
