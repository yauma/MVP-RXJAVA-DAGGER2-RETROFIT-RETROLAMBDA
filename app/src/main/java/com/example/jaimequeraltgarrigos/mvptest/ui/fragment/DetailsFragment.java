package com.example.jaimequeraltgarrigos.mvptest.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ProgressBar;

import com.example.jaimequeraltgarrigos.mvptest.AppComponent;
import com.example.jaimequeraltgarrigos.mvptest.MyConstant;
import com.example.jaimequeraltgarrigos.mvptest.R;
import com.example.jaimequeraltgarrigos.mvptest.common.BaseFragment;
import com.example.jaimequeraltgarrigos.mvptest.component.DaggerMatchSearchComponent;
import com.example.jaimequeraltgarrigos.mvptest.module.MatchSearchModule;
import com.example.jaimequeraltgarrigos.mvptest.presenter.MatchesSearchPresenter;
import com.example.jaimequeraltgarrigos.mvptest.ui.activity.NavigationUtils;
import com.example.jaimequeraltgarrigos.mvptest.ui.adapter.AllMatchesAdapter;
import com.example.jaimequeraltgarrigos.mvptest.ui.viewmodel.MatchSearchView;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by jaimequeraltgarrigos on 6/11/16.
 */
public class DetailsFragment extends BaseFragment implements MatchSearchView {

    @Inject
    MatchesSearchPresenter presenter;
    @Inject
    AllMatchesAdapter adapter;

    @BindView(R.id.allMatchesRecyclerView)
    RecyclerView mRecyclerView;
    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;
    private ArrayList<Object> matches;


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


    protected void viewCreated() {
        String query = MyConstant.ALL;
        presenter.searchMatches(query);
        setupList(mRecyclerView, adapter);
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
