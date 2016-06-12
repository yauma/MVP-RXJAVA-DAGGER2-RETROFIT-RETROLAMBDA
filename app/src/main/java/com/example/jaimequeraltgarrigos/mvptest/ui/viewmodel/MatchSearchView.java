package com.example.jaimequeraltgarrigos.mvptest.ui.viewmodel;

import java.util.ArrayList;

/**
 * Created by jaimequeraltgarrigos on 5/29/16.
 */
public interface MatchSearchView {

    void displayFoundMatches(ArrayList<Object> matches);

    void displayFailedSearch();

    void displayNetworkError();

    void displayServerError();

}
