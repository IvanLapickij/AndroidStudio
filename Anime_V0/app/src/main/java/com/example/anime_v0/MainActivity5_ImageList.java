package com.example.anime_v0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity5_ImageList extends AppCompatActivity {

    private ArrayList<String> names;
    private ArrayList<Integer> images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5_image_list);

        ListView list = findViewById(R.id.id_list);

        names = new ArrayList<>();
        names.add("Yuji Itadori.");
        names.add("Megumi Fushiguro.");
        names.add("Maki Zen'in.");

        images = new ArrayList<>();
        images.add(R.drawable.img1);
        images.add(R.drawable.img2);
        images.add(R.drawable.img3);


        MyAdapter adapter = new MyAdapter();
        list.setAdapter(adapter);

    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.size();  //added this
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.my_card, viewGroup, false);
            ImageView myImageView = view.findViewById(R.id.imageView);
            TextView myTextView = view.findViewById(R.id.textView);

            myImageView.setImageResource(images.get(i));
            myTextView.setText(names.get(i));

            return view;
        }

    }

}