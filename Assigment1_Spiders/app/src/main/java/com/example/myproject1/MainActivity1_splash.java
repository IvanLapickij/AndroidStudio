package com.example.myproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity1_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1_splash);

        Thread splashTread = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                finish();
                Intent i = new Intent(MainActivity1_splash.this, MainActivity2_choice.class);
                startActivity(i);
            }
        });
        splashTread.start();


    }
}