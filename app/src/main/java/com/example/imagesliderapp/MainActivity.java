package com.example.imagesliderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    List<Data> dataList;
    MyAdapter mAdapter;

    String url1 = "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg?crop=1.00xw:0.669xh;0,0.190xh&resize=1200:*";
    String url2 = "https://i.ytimg.com/vi/1Ne1hqOXKKI/maxresdefault.jpg";
    String url3 = "https://static.scientificamerican.com/sciam/cache/file/ACF0A7DC-14E3-4263-93F438F6DA8CE98A_source.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewPager);

        dataList = new ArrayList<>();

        dataList.add(new Data(url1));
        dataList.add(new Data(url2));
        dataList.add(new Data(url3));

        mAdapter = new MyAdapter(dataList, this);
        viewPager2.setAdapter(mAdapter);
    }
}