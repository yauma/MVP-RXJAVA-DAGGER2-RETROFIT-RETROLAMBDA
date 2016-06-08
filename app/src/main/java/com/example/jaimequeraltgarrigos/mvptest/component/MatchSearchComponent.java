package com.example.jaimequeraltgarrigos.mvptest.component;

import com.example.jaimequeraltgarrigos.mvptest.ActivityScope;
import com.example.jaimequeraltgarrigos.mvptest.AppComponent;
import com.example.jaimequeraltgarrigos.mvptest.module.MatchSearchModule;
import com.example.jaimequeraltgarrigos.mvptest.presenter.MatchesSearchPresenter;
import com.example.jaimequeraltgarrigos.mvptest.ui.adapter.MatchesAdapter;
import com.example.jaimequeraltgarrigos.mvptest.ui.fragment.MatchesFragment;

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

    void inject(MatchesFragment matchesFragment);

    MatchesSearchPresenter getPresenter();

    MatchesAdapter getAdapter();


}
