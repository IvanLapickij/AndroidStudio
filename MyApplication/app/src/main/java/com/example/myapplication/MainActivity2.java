package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView img1;
    @SuppressLint("MissingInflatedID")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img1=findViewById(R.id.img1);

        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               Intent i = new Intent(MainActivity2.this,MainActivity3.class);
               startActivity(i);
            }
        });


    }
}