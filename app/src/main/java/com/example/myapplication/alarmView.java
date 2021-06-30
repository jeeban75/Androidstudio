package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Bundle;
import android.widget.TimePicker;

public class alarmView extends AppCompatActivity {

    TimePicker timePicker;
    AlarmManager alarmManager;
    PendingIntent pendingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_view);

        timePicker = (TimePicker)findViewById(R.id.timePicker);
    }
}
