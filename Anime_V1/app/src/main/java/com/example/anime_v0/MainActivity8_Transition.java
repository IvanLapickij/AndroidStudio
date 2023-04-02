package com.example.anime_v0;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8_Transition extends AppCompatActivity {


    private EditText etx;
    private SharedPreferences sp_database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity8_transition);
        etx = findViewById(R.id.etx);
        Button btu_store = findViewById(R.id.btu_store);
        Button btu_show = findViewById(R.id.btu_show);

        btu_store.setOnClickListener(view -> {

            sp_database = getApplicationContext().getSharedPreferences("table_store_text", MODE_PRIVATE);
            SharedPreferences.Editor editor = sp_database.edit();
            String txt = etx.getText().toString();
            editor.putString("key_saved_text", txt);
            editor.apply();
            Toast.makeText(MainActivity8_Transition.this, "Data Saved!", Toast.LENGTH_SHORT).show();

        });

        btu_show.setOnClickListener(view -> {
            sp_database = getApplicationContext().getSharedPreferences("table_store_text", MODE_PRIVATE);
            String name = sp_database.getString("key_saved_text", null);
            Toast.makeText(MainActivity8_Transition.this, name, Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.transition.slide_in_left,R.transition.slide_out_right);// transition
    }
}
