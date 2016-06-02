package com.example.jaimequeraltgarrigos.mvptest.common;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import butterknife.ButterKnife;

/**
 * Created by Pedro Antonio Hernández on 14/06/2015.
 *
 * <p>
 *     A fragment like an activity only will execute operations that affect the UI.
 *     These operations are defined by a view model and are triggered by its presenter.
 * </p>
 */
public abstract class BaseFragment extends Fragment {

    protected Context CONTEXT;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        CONTEXT = activity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        searchMatches();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getFragmentLayout(), container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindViews(view);
    }

    @Override
    public void onStart() {
        super.onStart();
        getPresenter().onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        getPresenter().onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }


    /**
     * Specify the layout of the fragment to be inflated in the {@link BaseFragment#onCreateView(LayoutInflater, ViewGroup, Bundle)}
     * */
    protected abstract int getFragmentLayout();

    /**
     * @return The presenter attached to the fragment. This must extends from {@link BasePresenter}
     * */
    protected abstract BasePresenter getPresenter();

    /**
     * Trigger the search to the API calling the presenter method
     * */
    protected abstract void searchMatches();



    /**
     * Replace all the annotated fields with ButterKnife annotations with the proper value
     * */
    private void bindViews(View rootView) {
        ButterKnife.bind(this, rootView);
    }


}
