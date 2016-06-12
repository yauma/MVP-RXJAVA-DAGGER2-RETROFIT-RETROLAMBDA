package com.example.jaimequeraltgarrigos.mvptest.module;

import android.content.Context;

import com.example.jaimequeraltgarrigos.mvptest.interactor.MatchSearchInteractor;
import com.example.jaimequeraltgarrigos.mvptest.presenter.MatchesSearchPresenter;
import com.example.jaimequeraltgarrigos.mvptest.ui.adapter.AllMatchesAdapter;
import com.example.jaimequeraltgarrigos.mvptest.ui.adapter.FinishedMatchesAdapter;
import com.example.jaimequeraltgarrigos.mvptest.ui.adapter.LiveMatchesAdapter;
import com.example.jaimequeraltgarrigos.mvptest.ui.viewmodel.MatchSearchView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaimequeraltgarrigos on 6/2/16.
 */
@Module
public class MatchSearchModule {
    MatchSearchView view;

    public MatchSearchModule(MatchSearchView view) {
        this.view = view;
    }

    @Provides
    public MatchSearchView provideView() {
        return view;
    }

    @Provides
    public MatchesSearchPresenter providePresenter(MatchSearchView view, MatchSearchInteractor interactor) {
        return new MatchesSearchPresenter(view, interactor);
    }


    @Provides
    public AllMatchesAdapter provideAllAdapter(Context context) {
        return new AllMatchesAdapter(context);
    }

    @Provides
    public LiveMatchesAdapter provideLiveAdapter(Context context) {
        return new LiveMatchesAdapter(context);
    }

    @Provides
    public FinishedMatchesAdapter provideFinishedAdapter(Context context) {
        return new FinishedMatchesAdapter(context);
    }


}
