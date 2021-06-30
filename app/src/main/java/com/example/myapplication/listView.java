package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listView extends AppCompatActivity {

    ListView listView;

    ArrayList<Team> teams;
   // String[] country= {"India","Sri Lanka","Bhutan","Myanmmar","Africa","Ghana","Britan","UK","Greenland","Nepal","Usa","Russia","Azerbizan","Canada","france","israel","Norway","Afghanistan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView)findViewById(R.id.list_id);

        teams = new ArrayList<>();

        teams.add(new Team(R.drawable.img1,"Thor","avengers"));
        teams.add(new Team(R.drawable.img2,"Cap","avengers"));
        teams.add(new Team(R.drawable.img3,"Hulk","avengers"));
        teams.add(new Team(R.drawable.img4,"Iron Man","avengers"));
        // adapter
      //  ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.list_view_layout,R.id.layout_txt,country);

        //custom adapter
        customAdapter customAdapter = new customAdapter(this,teams);
        listView.setAdapter(customAdapter);

        //to click list item
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String value = customAdapter.getItem(position).toString();
               Toast.makeText(listView.this,value , Toast.LENGTH_SHORT).show();
           }
       });
    }
}