package com.example.jaimequeraltgarrigos.mvptest.ui.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jaimequeraltgarrigos.mvptest.R;
import com.example.jaimequeraltgarrigos.mvptest.domain.Match;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by jaimequeraltgarrigos on 6/11/16.
 */
public abstract class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.ViewHolder> {


    public static final int LEAGUE_NAME = 0;
    public static final int MATCH = 1;


    private ArrayList<Object> mDataSet;
    private final Context context;

    /*
        private static MyClickListener myClickListener;
    */

    public MatchesAdapter(Context context) {
        this.mDataSet = new ArrayList<>();
        this.context = context;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        if (viewHolder.getItemViewType() == LEAGUE_NAME) {
            LeagueNameViewHolder holder = (LeagueNameViewHolder) viewHolder;
            String leagueName = (String) mDataSet.get(position);
            holder.leagueName.setText(leagueName.toUpperCase());
        } else {
            MatchViewHolder holder = (MatchViewHolder) viewHolder;
            Match match = (Match) mDataSet.get(position);
            try {
                Picasso.with(context).load(match.getTeams().get(0).getLogoUrl()).into(holder.team1Avatar);
                Picasso.with(context).load(match.getTeams().get(1).getLogoUrl()).into(holder.team2Avatar);
                holder.scoreTeam1.setText(match.getTeams().get(0).getResults().getRunningscore());
                holder.scoreTeam2.setText(match.getTeams().get(1).getResults().getRunningscore());
                holder.team1Name.setText(match.getTeams().get(0).getShortName());
                holder.team2Name.setText(match.getTeams().get(1).getShortName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public int getItemViewType(int position) {
        if (mDataSet.get(position) instanceof String) {
            return LEAGUE_NAME;
        } else {
            return MATCH;
        }
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void addLeagues(ArrayList<Object> allLeaguesList) {
        mDataSet = allLeaguesList;
        notifyDataSetChanged();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View v) {
            super(v);
        }
    }

    public static class MatchViewHolder extends ViewHolder {
        CardView cv;
        TextView scoreTeam1;
        TextView scoreTeam2;
        TextView team1Name;
        TextView team2Name;
        ImageView team1Avatar;
        ImageView team2Avatar;
        LinearLayout linearLayoutMatchContainer;

        public MatchViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            scoreTeam1 = (TextView) itemView.findViewById(R.id.scoreTeam1);
            scoreTeam2 = (TextView) itemView.findViewById(R.id.scoreTeam2);
            team1Name = (TextView) itemView.findViewById(R.id.team1Name);
            team2Name = (TextView) itemView.findViewById(R.id.team2Name);
            team1Avatar = (ImageView) itemView.findViewById(R.id.team1Avatar);
            team2Avatar = (ImageView) itemView.findViewById(R.id.team2Avatar);
            linearLayoutMatchContainer = (LinearLayout) itemView.findViewById(R.id.linearLayoutContainer);
        }

    }

    public static class LeagueNameViewHolder extends ViewHolder {
        TextView leagueName;

        public LeagueNameViewHolder(View itemView) {
            super(itemView);
            leagueName = (TextView) itemView.findViewById(R.id.leagueName);
        }
    }

    public interface MyClickListener {
        public void onItemClick(int position, View v);
    }

}
