package com.example.jaimequeraltgarrigos.mvptest.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.jaimequeraltgarrigos.mvptest.AppComponent;
import com.example.jaimequeraltgarrigos.mvptest.MyApplication;
import com.example.jaimequeraltgarrigos.mvptest.R;


/**
 * Created by Pedro Antonio Hernández on 12/06/2015.
 *
 * <p>
 * The activity only will execute operations that affect the UI. These operations are defined
 * by a view model and are triggered by its presenter.
 * </p>
 *
 * <p>
 * Perhaps the activity only will work as a fragment container, if that is the case only
 * return null on {@link BaseActivity#getPresenter()}
 * </p>
 * <p>
 * I made some modifications to the BaseActivity presented in the next project.
 * I implement Dagger 2 instead Dagger 1 and i attach the presenter directly
 * <a href="https://github.com/pedrovgs/EffectiveAndroidUI">EffectiveAndroidUI</a>
 * </p>
 */
public abstract class BaseActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    /**
     * The onCreate base will set the view specified in {@link #getLayout()} and will
     * inject dependencies and views.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        setNavDrawer();
        injectDependencies();
    }

    protected abstract void setNavDrawer();

    private void injectDependencies() {
        setComponent(MyApplication.getApp(this).getComponent());
    }

    protected abstract void setComponent(AppComponent component);


    /**
     * @return The layout that's gonna be the activity view.
     */
    protected abstract int getLayout();

    /**
     * @return The presenter attached to the activity. This must extends from {@link BasePresenter}
     */
    @Nullable
    protected abstract BasePresenter getPresenter();



}

