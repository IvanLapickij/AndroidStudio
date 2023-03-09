package com.example.myproject1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4_ptext extends AppCompatActivity {
    private EditText edtx1;
    private Button btu1;

    @SuppressLint("MissingInflatedID")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4_ptext);

        edtx1 = findViewById(R.id.edtx1);

        btu1 = findViewById(R.id.btu1);

        btu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4_ptext.this, MainActivity5_txtview.class);
                String myText = edtx1.getText().toString();
                i.putExtra("TextToSend",myText);
                startActivity(i);
            }
        });



}}
