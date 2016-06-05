package com.example.jaimequeraltgarrigos.mvptest;

import android.content.Context;

import com.example.jaimequeraltgarrigos.mvptest.interactor.MatchSearchInteractor;
import com.example.jaimequeraltgarrigos.mvptest.module.InteractorModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jaimequeraltgarrigos on 6/2/16.
 */
@Singleton
@Component(
        modules = {
                AppModule.class,
                InteractorModule.class
        })
public interface AppComponent {
    Context getContext();
    MatchSearchInteractor getMatchSearchInteractor();
}
