package com.example.anime_v0;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.camera_btu1) {
            Toast.makeText(this, "CAMERA", Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(MainActivity.this, MainActivity2_Camera.class);
            MainActivity.this.startActivity(myIntent);
            return true;
        }

        if (id == R.id.calendar_btu2) {
            Toast.makeText(this, "Calendar", Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(MainActivity.this, MainActivity3_Calendar.class);
            MainActivity.this.startActivity(myIntent);
            return true;
        }

        if (id == R.id.cbtu_contact) {
            Toast.makeText(this, "Contact", Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(MainActivity.this, MainActivity4_Contact.class);
            MainActivity.this.startActivity(myIntent);
            return true;
        }
        if (id == R.id.btu_ImageList) {
            Toast.makeText(this, "Images", Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(MainActivity.this, MainActivity5_ImageList.class);
            MainActivity.this.startActivity(myIntent);
            return true;
        }
        if (id == R.id.btu_flipper) {
            Toast.makeText(this, "Flipper", Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(MainActivity.this, MainActivity7_textViewFlipper.class);
            MainActivity.this.startActivity(myIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    CardView card1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btu_wow = findViewById(R.id.btu_wow);

        btu_wow.setOnClickListener(view -> {
            MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.sound1);
            mp.start();

        });
        // CardView
        card1 = findViewById(R.id.card1);
        card1.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, "JUJUTSU KAISEN", Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(MainActivity.this, MainActivity6_SimpleList.class);
            MainActivity.this.startActivity(myIntent);
        });


        Button btu_next = findViewById(R.id.btu_next2);

        btu_next.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this,MainActivity8_Transition.class);
            startActivity(i);
            overridePendingTransition(R.transition.slide_in_right,R.transition.slide_out_left);// transition
        });
    }
}