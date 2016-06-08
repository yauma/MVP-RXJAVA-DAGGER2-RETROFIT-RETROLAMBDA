package com.example.jaimequeraltgarrigos.mvptest.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.example.jaimequeraltgarrigos.mvptest.AppComponent;
import com.example.jaimequeraltgarrigos.mvptest.R;
import com.example.jaimequeraltgarrigos.mvptest.common.BaseFragment;
import com.example.jaimequeraltgarrigos.mvptest.common.BasePresenter;
import com.example.jaimequeraltgarrigos.mvptest.component.DaggerMatchSearchComponent;
import com.example.jaimequeraltgarrigos.mvptest.module.MatchSearchModule;
import com.example.jaimequeraltgarrigos.mvptest.presenter.MatchesSearchPresenter;
import com.example.jaimequeraltgarrigos.mvptest.ui.activity.DetailsActivity;
import com.example.jaimequeraltgarrigos.mvptest.ui.adapter.MatchesAdapter;
import com.example.jaimequeraltgarrigos.mvptest.ui.viewmodel.MatchSearchView;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;


/**
 * Created by jaimequeraltgarrigos on 5/30/16.
 */
public class MatchesFragment extends BaseFragment implements MatchSearchView {

    @Inject
    MatchesSearchPresenter presenter;

    @Inject
    MatchesAdapter adapter;

    @Inject
    Context context;

    @BindView(R.id.allMatchesRecyclerView)
    RecyclerView mRecyclerView;

    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;


        public static MatchesFragment newInstance(String query) {
        MatchesFragment matchesFragment = new MatchesFragment();

        Bundle args = new Bundle();
        args.putString("query", query);
        matchesFragment.setArguments(args);

        return matchesFragment;
    }

    @Override
    protected void setupComponent(AppComponent component) {
        DaggerMatchSearchComponent.builder().appComponent(component)
                .matchSearchModule(new MatchSearchModule(this)).build()
                .inject(this);

    }

    @Override
    public void onResume() {
        super.onResume();
        adapter.setOnItemClickListener(new MatchesAdapter.MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Intent i = new Intent(context, DetailsActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_allmatches;
    }

    @Override
    protected BasePresenter getPresenter() {
        return presenter;
    }

    protected void viewCreated() {
        String query = getArguments().getString("query");
        presenter.searchMatches(query);
    }

    @Override
    public void setupList() {

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(CONTEXT));
        mRecyclerView.setAdapter(adapter);

    }

    @Override
    public void setupAdapter() {
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
