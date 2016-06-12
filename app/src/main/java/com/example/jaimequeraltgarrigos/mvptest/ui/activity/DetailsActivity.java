package com.example.jaimequeraltgarrigos.mvptest.ui.activity;

import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jaimequeraltgarrigos.mvptest.AppComponent;
import com.example.jaimequeraltgarrigos.mvptest.R;
import com.example.jaimequeraltgarrigos.mvptest.common.BaseActivity;
import com.example.jaimequeraltgarrigos.mvptest.common.BasePresenter;
import com.example.jaimequeraltgarrigos.mvptest.domain.Match;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jaimequeraltgarrigos on 6/7/16.
 */
public class DetailsActivity extends BaseActivity {

    @BindView(R.id.logo)
    ImageView logo;
    @BindView(R.id.logo2)
    ImageView logo2;
    @BindView(R.id.detailScoreTeam1)
    TextView scoreTeam1;
    @BindView(R.id.detailScoreTeam2)
    TextView scoreTeam2;
    @BindView(R.id.team1Name)
    TextView team1Name;
    @BindView(R.id.team2Name)
    TextView team2Name;
    @BindView(R.id.containerDetails)
    LinearLayout containerDetails;
    @BindView(R.id.app_bar)
    AppBarLayout appBarLayout;
    @BindView(R.id.containerScores)
    LinearLayout containerScores;
    @BindView(R.id.containerTeams)
    LinearLayout containerTeams;

    private Match matchDetail;

    @Override
    protected void setViews() {
        Gson gson = new Gson();
        matchDetail = gson.fromJson(getIntent().getStringExtra("match"), Match.class);
        ButterKnife.bind(this);
        setMatchDetails();
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                coordinateDetailsViews(appBarLayout, verticalOffset);
            }
        });
    }

    private void coordinateDetailsViews(AppBarLayout appBarLayout, int verticalOffset) {
        float scrollRange = appBarLayout.getTotalScrollRange();
        float percentScroll = -verticalOffset / scrollRange;
        float scaleFactor = 1 - (percentScroll / 2);
        float scaleFactorTeams = 1 - (percentScroll * 2);

        logo.setTranslationY(appBarLayout.getY() / 2);
        logo.setScaleX(scaleFactor);
        logo.setScaleY(scaleFactor);

        logo2.setTranslationY(appBarLayout.getY() / 2);
        logo2.setScaleX(scaleFactor);
        logo2.setScaleY(scaleFactor);

        containerScores.setTranslationY(appBarLayout.getY() / 2);
        containerScores.setScaleX(scaleFactor);
        containerScores.setScaleY(scaleFactor);

        containerTeams.setScaleX(scaleFactorTeams);
        containerTeams.setScaleY(scaleFactorTeams);

        if (percentScroll > 0.1) {
            containerTeams.setVisibility(View.GONE);
        } else if (percentScroll > -0.9) {
            containerTeams.setVisibility(View.VISIBLE);
        }
    }

    private void setMatchDetails() {
        Picasso.with(this).load(matchDetail.getTeams().get(0).getLogoUrl()).into(logo);
        Picasso.with(this).load(matchDetail.getTeams().get(1).getLogoUrl()).into(logo2);
        scoreTeam1.setText(matchDetail.getTeams().get(0).getResults().getRunningscore());
        scoreTeam2.setText(matchDetail.getTeams().get(1).getResults().getRunningscore());
        team1Name.setText(matchDetail.getTeams().get(0).getShortName());
        team2Name.setText(matchDetail.getTeams().get(1).getShortName());
    }


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
