package com.example.myproject1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity5_txtview extends AppCompatActivity {
        private TextView txtv1;


        @SuppressLint("MissingInflatedID")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity5_txtview);

            txtv1=findViewById(R.id.txtv1);

            try {
                Bundle extras = getIntent().getExtras();
                String sentText = extras.getString("TextToSend");
                txtv1.setText(sentText);
            }catch (RuntimeException e){

                e.printStackTrace();
            }
}}
