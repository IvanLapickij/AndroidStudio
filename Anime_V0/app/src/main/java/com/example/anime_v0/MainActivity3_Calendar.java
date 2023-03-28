package com.example.anime_v0;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity3_Calendar extends AppCompatActivity {
    CalendarView calendarView;
    TextView redDateText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_calendar);
        calendarView = findViewById(R.id.id_calendarView);
        redDateText = findViewById(R.id.id_textView);

        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {

            String myDate = dayOfMonth + "/" + (month +1) +  "/" + year; // note the months start at 0

            redDateText.setText(myDate);

        });
    }


}