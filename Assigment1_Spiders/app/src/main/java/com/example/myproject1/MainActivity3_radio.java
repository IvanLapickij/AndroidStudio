package com.example.myproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity3_radio extends AppCompatActivity {

    private RadioButton spider1;
    private RadioButton spider2;
    private RadioButton spider3;

    private ImageView imageView_spiders;
    private RadioGroup spiders;
    private RadioButton choiceSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3_radio);
        this.imageView_spiders = findViewById(R.id.imageView_spiders);
        this.spiders = findViewById(R.id.spiders);

        spiders = findViewById(R.id.spiders);
        spider1 = findViewById(R.id.spider1);
        spider2 = findViewById(R.id.spider2);
        spider3 = findViewById(R.id.spider3);

        spider1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
//            determines which button is selected
            int selectedId = spiders.getCheckedRadioButtonId();
            choiceSelected = findViewById(selectedId);
//            end
            imageView_spiders.setImageResource(R.drawable.spider1);
//            Toast.makeText(MainMenu.this, choiceSelected.getText(), Toast.LENGTH_SHORT).show();

            }
        });
//        for button2
        spider2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//            determines which button is selected
                int selectedId = spiders.getCheckedRadioButtonId();
                choiceSelected = findViewById(selectedId);
//            end
                MainActivity3_radio.this.imageView_spiders.setImageResource(R.drawable.spider2);
//                Toast.makeText(MainMenu.this, choiceSelected.getText(), Toast.LENGTH_SHORT).show();

            }
        });

//        for button3
        spider3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//            determines which button is selected
                int selectedId = spiders.getCheckedRadioButtonId();
                choiceSelected = findViewById(selectedId);
//            end
                imageView_spiders.setImageResource(R.drawable.spider3);
//                Toast.makeText(MainMenu.this, choiceSelected.getText(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}