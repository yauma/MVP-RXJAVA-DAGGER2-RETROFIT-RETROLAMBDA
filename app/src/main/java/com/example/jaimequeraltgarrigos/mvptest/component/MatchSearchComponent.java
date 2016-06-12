package com.example.jaimequeraltgarrigos.mvptest.component;

import com.example.jaimequeraltgarrigos.mvptest.ActivityScope;
import com.example.jaimequeraltgarrigos.mvptest.AppComponent;
import com.example.jaimequeraltgarrigos.mvptest.module.MatchSearchModule;
import com.example.jaimequeraltgarrigos.mvptest.presenter.MatchesSearchPresenter;
import com.example.jaimequeraltgarrigos.mvptest.ui.adapter.AllMatchesAdapter;
import com.example.jaimequeraltgarrigos.mvptest.ui.adapter.FinishedMatchesAdapter;
import com.example.jaimequeraltgarrigos.mvptest.ui.adapter.LiveMatchesAdapter;
import com.example.jaimequeraltgarrigos.mvptest.ui.fragment.AllMatchesFragment;
import com.example.jaimequeraltgarrigos.mvptest.ui.fragment.FinishedMatchesFragment;
import com.example.jaimequeraltgarrigos.mvptest.ui.fragment.LiveMatchesFragment;

import dagger.Component;

/**
 * Created by jaimequeraltgarrigos on 6/2/16.
 */
@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = MatchSearchModule.class
)

public interface MatchSearchComponent {

    void inject(LiveMatchesFragment liveMatchesFragment);

    void inject(FinishedMatchesFragment finishedMatchesFragment);

    void inject(AllMatchesFragment allMatchesFragment);


    MatchesSearchPresenter getPresenter();


    AllMatchesAdapter getAllAdapter();

    LiveMatchesAdapter getLiveAdapter();

    FinishedMatchesAdapter getFinishedAdapter();


}
