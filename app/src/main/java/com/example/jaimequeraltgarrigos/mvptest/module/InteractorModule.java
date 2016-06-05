package com.example.jaimequeraltgarrigos.mvptest.module;

import com.example.jaimequeraltgarrigos.mvptest.interactor.MatchSearchInteractor;
import com.example.jaimequeraltgarrigos.mvptest.io.api.MatchServices;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaimequeraltgarrigos on 6/2/16.
 */
@Module
public class InteractorModule {

    @Provides
    public MatchSearchInteractor provideMatchSearchInteractor(MatchServices services) {
        return new MatchSearchInteractor(services);
    }

}
