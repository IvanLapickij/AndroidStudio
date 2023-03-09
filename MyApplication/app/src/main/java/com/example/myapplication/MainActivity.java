package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread splashTread = new Thread() {

            public void run() {
                try {
                    sleep(2000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);
                }
            }
        };
        splashTread.start();

    }

}