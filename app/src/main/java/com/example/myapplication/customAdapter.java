package com.example.myapplication;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class customAdapter extends BaseAdapter{
    Context context;
    //String[] country;
    ArrayList<Team> teams;
    public customAdapter(Context context , ArrayList<Team> teams) {
        this.context=context;
        this.teams = teams;

    }

    @Override
    public int getCount() {
        return teams.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_view_layout,parent,false);
        TextView textName = view.findViewById(R.id.layout_txt);
        TextView textTeam = view.findViewById(R.id.layout_txt2);
        ImageView imageView = view.findViewById(R.id.layout_img);

        Team team= teams.get(position);
        textName.setText(team.getHeroName());
        textTeam.setText(team.getHeroTeam());

        imageView.setImageDrawable(context.getResources().getDrawable(team.getImgTeam()));
        return view;
    }
}
