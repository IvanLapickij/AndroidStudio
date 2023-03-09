package com.example.myproject1;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2_choice extends AppCompatActivity {
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;

    private Button btu_maps;
    private Button btu_phone;
    private Button btu_browser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_choice);

        img1=findViewById(R.id.img1);
        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               Intent i = new Intent(MainActivity2_choice.this, MainActivity3_radio.class);
               startActivity(i);
            }
        });

        img2=findViewById(R.id.img2);
        img2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity2_choice.this, MainActivity4_ptext.class);
                startActivity(i);
            }
        });

        img3=findViewById(R.id.img3);
        img3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity2_choice.this, MainActivity6_webview.class);
                startActivity(i);
            }
        });

        img4=findViewById(R.id.img4);
        img4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity2_choice.this, MainActivity7_youtube.class);
                startActivity(i);
            }
        });

        btu_maps=findViewById(R.id.btu_maps);
        btu_maps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:48.8584,2.2945"));
                startActivity(i);
            }
        });

        btu_phone=findViewById(R.id.btu_phone);
        btu_phone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + "+01234567"));
              //  if (i.resolveActivity(getPackageManager()) != null)
                    startActivity(i);
            }
        });

        btu_browser=findViewById(R.id.btu_browser);
        btu_browser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Uri uri = Uri.parse("https://www.google.lt/?gws_rd=ssl");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
    }
}