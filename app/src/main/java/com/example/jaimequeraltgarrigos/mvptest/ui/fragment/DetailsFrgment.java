package com.example.jaimequeraltgarrigos.mvptest.ui.fragment;

import com.example.jaimequeraltgarrigos.mvptest.AppComponent;
import com.example.jaimequeraltgarrigos.mvptest.R;
import com.example.jaimequeraltgarrigos.mvptest.common.BaseFragment;
import com.example.jaimequeraltgarrigos.mvptest.common.BasePresenter;
import com.example.jaimequeraltgarrigos.mvptest.component.DaggerMatchSearchComponent;
import com.example.jaimequeraltgarrigos.mvptest.module.MatchSearchModule;
import com.example.jaimequeraltgarrigos.mvptest.presenter.MatchesSearchPresenter;
import com.example.jaimequeraltgarrigos.mvptest.ui.viewmodel.MatchSearchView;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by jaimequeraltgarrigos on 6/7/16.
 */
public class DetailsFrgment extends BaseFragment implements MatchSearchView {

    @Inject
    MatchesSearchPresenter presenter;

    @Override
    protected void viewCreated() {

    }

    @Override
    protected void setupComponent(AppComponent component) {
        DaggerMatchSearchComponent.builder().appComponent(component)
                .matchSearchModule(new MatchSearchModule(this)).build()
                .inject(this);
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.container_details;
    }

    @Override
    protected BasePresenter getPresenter() {
        return presenter;
    }

    @Override
    public void setupList() {

    }

    @Override
    public void setupAdapter() {

    }

    @Override
    public void displayFoundMatches(ArrayList<Object> matches) {

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
