package com.example.jaimequeraltgarrigos.mvptest.ui.activity;

import android.support.annotation.Nullable;

import com.example.jaimequeraltgarrigos.mvptest.AppComponent;
import com.example.jaimequeraltgarrigos.mvptest.R;
import com.example.jaimequeraltgarrigos.mvptest.common.BaseActivity;
import com.example.jaimequeraltgarrigos.mvptest.common.BasePresenter;

public class HomeActivity extends BaseActivity {


    @Override
    protected void setComponent(AppComponent component) {
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_home;
    }

    @Nullable
    @Override
    protected BasePresenter getPresenter() {
        return null;
    }
}
