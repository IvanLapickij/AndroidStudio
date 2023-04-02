package com.example.anime_v0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity12_Inflater extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity12_inflater);

        // get a reference to the already created main layout
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.layout_12);

        // inflate (create) another copy of our custom layout
        LayoutInflater inflater = getLayoutInflater();
        View myLayout = inflater.inflate(R.layout.my_layout, mainLayout, false);


        mainLayout.setOnClickListener(view -> {
            // make changes to our custom layout and its subviews
            myLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_500));
            TextView textView = (TextView) myLayout.findViewById(R.id.textView);
            textView.setText("New Layout");
//            setContentView(R.layout.activity_main);
            mainLayout.removeView(myLayout);
            // add our custom layout to the main layout
            mainLayout.addView(myLayout);

        });
    }
}