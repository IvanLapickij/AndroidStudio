package com.example.myproject1;

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
                    sleep(4000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                    Intent i = new Intent(MainActivity.this, MainActivity_Main_Menu.class);
                    startActivity(i);
                }
            }
        };
        splashTread.start();


    }
}