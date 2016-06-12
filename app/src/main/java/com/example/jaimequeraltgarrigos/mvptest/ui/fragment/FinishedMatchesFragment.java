package com.example.jaimequeraltgarrigos.mvptest.ui.fragment;

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
import com.example.jaimequeraltgarrigos.mvptest.ui.adapter.FinishedMatchesAdapter;
import com.example.jaimequeraltgarrigos.mvptest.ui.viewmodel.MatchSearchView;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by jaimequeraltgarrigos on 6/11/16.
 */
public class FinishedMatchesFragment extends BaseFragment implements MatchSearchView {

    @Inject
    MatchesSearchPresenter presenter;

    @Inject
    FinishedMatchesAdapter adapter;

    @BindView(R.id.allMatchesRecyclerView)
    RecyclerView mRecyclerView;

    @BindView(R.id.progressBar)
    ProgressBar mProgressBar;
    private ArrayList<Object> matches;


    public static FinishedMatchesFragment newInstance(String query) {
        FinishedMatchesFragment finishedMatchesFragment = new FinishedMatchesFragment();

        Bundle args = new Bundle();
        args.putString("query", query);
        finishedMatchesFragment.setArguments(args);

        return finishedMatchesFragment;
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
        adapter.setOnItemClickListener(new FinishedMatchesAdapter.MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Object match = matches.get(position);
            }
        });
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_allmatches;
    }

/*    @Override
    protected BasePresenter getPresenter() {
        return presenter;
    }*/

    protected void viewCreated() {
        String query = getArguments().getString("query");
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
