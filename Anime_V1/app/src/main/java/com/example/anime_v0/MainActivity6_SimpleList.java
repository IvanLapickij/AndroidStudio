package com.example.anime_v0;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity6_SimpleList extends AppCompatActivity {

    private ArrayList<String> characters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity6_simple_list);

        ListView listview = findViewById(R.id.listview);

        characters = new ArrayList<>();
        characters.add("Yuji Itadori");
        characters.add("Megumi Fushiguro");
        characters.add("Nobara Kugasaki");
        characters.add("Satoru Gojo");
        characters.add("Maki Zenin");
        characters.add("Toge Inumaki");
        characters.add("Panda");
        characters.add("Kento Nanami");
        characters.add("Sukuna");
        characters.add("Mahito");
        characters.add("Suguru Geto");
        characters.add("Aoi Todo");
        characters.add("Masamichi Yaga");
        characters.add("Mai Zenin");
        characters.add("Yuta Okkutsu");
        characters.add("Yuji Itadori");
        characters.add("Megumi Fushiguro");
        characters.add("Nobara Kugasaki");
        characters.add("Satoru Gojo");
        characters.add("Maki Zenin");
        characters.add("Toge Inumaki");
        characters.add("Panda");
        characters.add("Kento Nanami");
        characters.add("Sukuna");
        characters.add("Mahito");
        characters.add("Suguru Geto");
        characters.add("Aoi Todo");
        characters.add("Masamichi Yaga");
        characters.add("Mai Zenin");
        characters.add("Yuta Okkutsu");

        ArrayAdapter<String> dogAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                characters

        );



        listview.setAdapter(dogAdapter);

        listview.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(MainActivity6_SimpleList.this, characters.get(i), Toast.LENGTH_SHORT).show());
    }
}
