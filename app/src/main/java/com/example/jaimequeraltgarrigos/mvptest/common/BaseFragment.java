package com.example.jaimequeraltgarrigos.mvptest.common;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.jaimequeraltgarrigos.mvptest.AppComponent;
import com.example.jaimequeraltgarrigos.mvptest.MyApplication;

import butterknife.ButterKnife;

/**
 * Created by Pedro Antonio Hernández on 14/06/2015.
 * <p>
 * <p>
 * A fragment like an activity only will execute operations that affect the UI.
 * These operations are defined by a view model and are triggered by its presenter.
 * </p>
 */
public abstract class BaseFragment extends Fragment {

    protected static Context CONTEXT;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        CONTEXT = context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getFragmentLayout(), container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindViews(view);
        injectDepencies();
        viewCreated();
    }

    protected static void setupList(RecyclerView mRecyclerView, RecyclerView.Adapter adapter) {
        if (mRecyclerView != null && adapter != null){
            mRecyclerView.setHasFixedSize(true);
            mRecyclerView.setLayoutManager(new LinearLayoutManager(CONTEXT));
            mRecyclerView.setAdapter(adapter);
        }
    }

    protected abstract void viewCreated();

    private void injectDepencies() {
        setupComponent(MyApplication.getApp(getContext()).getComponent());
    }

    protected abstract void setupComponent(AppComponent component);


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }


    /**
     * Specify the layout of the fragment to be inflated in the {@link BaseFragment#onCreateView(LayoutInflater, ViewGroup, Bundle)}
     */
    protected abstract int getFragmentLayout();

    /**
     * @return The presenter attached to the fragment. This must extends from {@link BasePresenter}
     */


    /**
     * Replace all the annotated fields with ButterKnife annotations with the proper value
     */
    private void bindViews(View rootView) {
        ButterKnife.bind(this, rootView);
    }


}
