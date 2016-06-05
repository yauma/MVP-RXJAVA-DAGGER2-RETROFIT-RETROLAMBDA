package com.example.jaimequeraltgarrigos.mvptest.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import com.example.jaimequeraltgarrigos.mvptest.AppComponent;
import com.example.jaimequeraltgarrigos.mvptest.R;
import com.example.jaimequeraltgarrigos.mvptest.common.BaseFragment;
import com.example.jaimequeraltgarrigos.mvptest.common.BasePresenter;
import com.example.jaimequeraltgarrigos.mvptest.component.DaggerMatchSearchComponent;
import com.example.jaimequeraltgarrigos.mvptest.module.MatchSearchModule;
import com.example.jaimequeraltgarrigos.mvptest.presenter.MatchesSearchPresenter;
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

    @BindView(R.id.allMatchesRecyclerView)
    RecyclerView mRecyclerView;

    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;



    @Override
    protected void setupComponent(AppComponent component) {
        DaggerMatchSearchComponent.builder().appComponent(component)
                .matchSearchModule(new MatchSearchModule(this)).build()
                .inject(this);

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
        presenter.searchMatches();
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
