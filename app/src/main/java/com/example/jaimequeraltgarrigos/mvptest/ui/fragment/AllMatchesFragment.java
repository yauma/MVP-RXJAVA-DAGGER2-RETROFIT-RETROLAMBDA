package com.example.jaimequeraltgarrigos.mvptest.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.example.jaimequeraltgarrigos.mvptest.presenter.MatchesSearchPresenter;
import com.example.jaimequeraltgarrigos.mvptest.ui.activity.DetailsActivity;
import com.example.jaimequeraltgarrigos.mvptest.ui.adapter.MatchesAdapter;
import com.example.jaimequeraltgarrigos.mvptest.ui.viewmodel.MatchSearchView;

import java.util.ArrayList;

/**
 * Created by jaimequeraltgarrigos on 6/11/16.
 */
public class AllMatchesFragment extends MatchesFragment {


    private ArrayList<Object> matches;

    public static AllMatchesFragment newInstance(String query) {
        AllMatchesFragment matchesFragment = new AllMatchesFragment();

        Bundle args = new Bundle();
        args.putString("query", query);
        matchesFragment.setArguments(args);

        return matchesFragment;
    }


    @Override
    public void onResume() {
        super.onResume();
        adapter.setOnItemClickListener(new MatchesAdapter.MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Object match = matches.get(position);
            }
        });
    }

    @Override
    public void setupAdapter() {
    }

    @Override
    public void displayFoundMatches(ArrayList<Object> matches) {
        this.matches = matches;
        adapter.addLeagues(matches);
    }

    @Override
    public void displayFailedSearch() {

    }

    @Override
    public void displayNetworkError() {

    }

    @Override
    public void displayServerError() {

    }
}
