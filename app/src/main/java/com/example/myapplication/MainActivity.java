package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    Button Blogin,Bsignup,Blist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

    }
    public void addListenerOnButton(){

       final Context context = this;
       Blogin = (Button) findViewById(R.id.login_id);

       Blogin.setOnClickListener(new View.OnClickListener( ){
           @Override
           public void onClick(View v) {

                Intent intent = new Intent(context, Login.class);
                        startActivity(intent);

           }
       });
       Bsignup =(Button) findViewById(R.id.signup_id);

       Bsignup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                Intent intent = new Intent(context, signup.class);
                        startActivity(intent);
           }
       });

       Blist = (Button) findViewById(R.id.list_button);

       Blist.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(context, listView.class);
                       startActivity(intent);
           }
       });
    }
}