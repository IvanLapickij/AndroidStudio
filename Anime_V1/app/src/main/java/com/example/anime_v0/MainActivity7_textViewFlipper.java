package com.example.anime_v0;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7_textViewFlipper extends AppCompatActivity {


    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7_textviewflipper);

        viewFlipper = findViewById(R.id.view_flipper);
        Button btu_next = findViewById(R.id.btu_next);
        Button btu_prev = findViewById(R.id.btu_prev);

        btu_next.setOnClickListener(v -> {
            viewFlipper.setInAnimation(MainActivity7_textViewFlipper.this,R.anim.slide_in_left);
            viewFlipper.setOutAnimation(MainActivity7_textViewFlipper.this,R.anim.slide_out_right);
            viewFlipper.showNext();
        });

        btu_prev.setOnClickListener(v -> {
            viewFlipper.setInAnimation(MainActivity7_textViewFlipper.this,R.anim.slide_in_right);
            viewFlipper.setOutAnimation(MainActivity7_textViewFlipper.this,R.anim.slide_out_left);
            viewFlipper.showPrevious();
        });
    }
}
