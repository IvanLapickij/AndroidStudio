package com.example.anime_v0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity11_Random extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity11_random);

        int[] randomImage = {
                R.drawable.img1,
                R.drawable.img2,
                R.drawable.img3,
        };

        final ImageView img = (ImageView) findViewById(R.id.imageView001);

        final Random random = new Random();
// get a reference to the already created main layout
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.layout_random);

        // inflate (create) another copy of our custom layout
        LayoutInflater inflater = getLayoutInflater();
        View myLayout = inflater.inflate(R.layout.layout_extra, mainLayout, false);
        img.setOnClickListener(view -> {

            int myRandomImage = random.nextInt(3);
            Toast.makeText(MainActivity11_Random.this, "My random image id is : " + myRandomImage, Toast.LENGTH_SHORT).show();
            img.setImageResource(randomImage[myRandomImage]);
            mainLayout.removeView(myLayout);
            // add our custom layout to the main layout
            mainLayout.addView(myLayout);
        });


    }

    public boolean onOptionsItemSelected(ImageView image) {
        int id = image.getId();

        if (id == R.drawable.img1) {
            LinearLayout mainLayout = (LinearLayout) findViewById(R.id.layout_random);

            LayoutInflater inflater = getLayoutInflater();

            View myLayout = inflater.inflate(R.layout.layout_extra, mainLayout, false);
            TextView textView = (TextView) myLayout.findViewById(R.id.textView99);
            textView.setText("New Layout");

            return true;
        }
        return super.onOptionsItemSelected((MenuItem) image);
    }
}