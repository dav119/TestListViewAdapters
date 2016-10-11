package com.example.user1.testlistviewadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView listMyListView;

    ArrayList<String> arrayList;

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listMyListView = (ListView) findViewById(R.id.listMyListView);

        arrayList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            arrayList.add(i, "Element № " + String.valueOf(i + 1));
        }

        arrayAdapter = new ArrayAdapter<String>(this, R.layout.my_list_item, R.id.textItem, arrayList);

        listMyListView.setAdapter(arrayAdapter);


    }
}
