package com.example.jaimequeraltgarrigos.mvptest.ui.activity;

import android.support.annotation.Nullable;

import com.example.jaimequeraltgarrigos.mvptest.AppComponent;
import com.example.jaimequeraltgarrigos.mvptest.R;
import com.example.jaimequeraltgarrigos.mvptest.common.BaseActivity;
import com.example.jaimequeraltgarrigos.mvptest.common.BasePresenter;

/**
 * Created by jaimequeraltgarrigos on 6/7/16.
 */
public class DetailsActivity extends BaseActivity {
    @Override
    protected void setTablayout() {

    }

    @Override
    protected void setComponent(AppComponent component) {

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_details_scrolling;
    }

    @Nullable
    @Override
    protected BasePresenter getPresenter() {
        return null;
    }
}
