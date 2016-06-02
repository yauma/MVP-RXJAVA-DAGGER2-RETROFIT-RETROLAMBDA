package com.example.jaimequeraltgarrigos.mvptest.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.jaimequeraltgarrigos.mvptest.R;
import com.example.jaimequeraltgarrigos.mvptest.common.BaseFragment;
import com.example.jaimequeraltgarrigos.mvptest.common.BasePresenter;
import com.example.jaimequeraltgarrigos.mvptest.presenter.MatchesSearchPresenter;
import com.example.jaimequeraltgarrigos.mvptest.ui.adapter.MatchesAdapter;
import com.example.jaimequeraltgarrigos.mvptest.ui.viewmodel.MatchSearchView;

import java.util.ArrayList;

import butterknife.BindView;


/**
 * Created by jaimequeraltgarrigos on 5/30/16.
 */
public class MatchesFragment extends BaseFragment implements MatchSearchView{

    MatchesSearchPresenter presenter = new MatchesSearchPresenter(this);

    @BindView(R.id.allMatchesRecyclerView)
    RecyclerView mRecyclerView;

    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;
    private LinearLayoutManager mLayoutManager;

    MatchesAdapter adapter;
    private ArrayList<Object> mDataItems = new ArrayList<>();

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_allmatches;
    }

    @Override
    protected BasePresenter getPresenter() {
        return presenter;
    }

    @Override
    protected void searchMatches() {
        presenter.searchMatches();
    }

    @Override
    public void setupList() {

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(adapter);

    }

    @Override
    public void setupAdapter() {
        adapter = new MatchesAdapter(mDataItems,getContext());
    }

    @Override
    public void displayFoundMatches(ArrayList<Object> matches) {
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
