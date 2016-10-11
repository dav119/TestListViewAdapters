package com.example.user1.testlistviewadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ListView listMyListView;

    ArrayList<MyObject> arrayList;

    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listMyListView = (ListView) findViewById(R.id.listMyListView);

        arrayList = new ArrayList<>();

        for (int i = 0; i <= 10000; i++) {
            arrayList.add(new MyObject("Name1 №" + i, "Name2 №" + i, new Random().nextBoolean()));
        }

        myAdapter = new MyAdapter(this, arrayList);

        listMyListView.setAdapter(myAdapter);

    }
}
