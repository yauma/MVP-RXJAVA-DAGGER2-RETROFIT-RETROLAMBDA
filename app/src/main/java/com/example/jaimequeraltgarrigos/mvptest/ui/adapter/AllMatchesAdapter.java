package com.example.jaimequeraltgarrigos.mvptest.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jaimequeraltgarrigos.mvptest.R;

/**
 * Created by jaimequeraltgarrigos on 6/11/16.
 */
public class AllMatchesAdapter extends MatchesAdapter {
    public static MyClickListener myClickListener;

    public AllMatchesAdapter(Context context) {
        super(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == LEAGUE_NAME) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_league_name, parent, false);
            LeagueNameViewHolder matchViewHolder = new LeagueNameViewHolder(v);
            return matchViewHolder;
        } else {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_matches, parent, false);
            AllMatchViewHolder matchViewHolder = new AllMatchViewHolder(v);
            return matchViewHolder;
        }
    }

    public static class AllMatchViewHolder extends MatchViewHolder implements View.OnClickListener {

        public AllMatchViewHolder(View itemView) {
            super(itemView);
            linearLayoutMatchContainer.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            myClickListener.onItemClick(getAdapterPosition(), v);
        }
    }

    public void setOnItemClickListener(MyClickListener myClickListener) {
        this.myClickListener = myClickListener;
    }
}

