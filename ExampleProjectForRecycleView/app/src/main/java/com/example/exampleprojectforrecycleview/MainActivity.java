package com.example.exampleprojectforrecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //RecyclerView recyclerView;
        List<CardData> list = getData();
        recyclerView=(RecyclerView) findViewById(R.id.recyler_view);
        adapter = new Adapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(adapter);
    }

    List<CardData> getData()
    {
        List<CardData> list = new ArrayList<>();
        list.add(new CardData("Apple Event",
                "Speaker Tim Cook",
                "25-11-2017",
                "04:00 PM",
                "25","Nov"
        ));
        list.add(new CardData("Twitter Event",
                "Speaker Jack Dorsey",
                "01-11-2017",
                "07:00 AM",
                "01","Nov"
        ));
        list.add(new CardData("Goggle Event",
                "Speaker Larry Page",
                "18-10-2017",
                "02:00 PM",
                "18","Oct"
        ));
        list.add(new CardData("FacebookEvent",
                "Speaker Mark zuckerberg",
                "16-10-2017",
                "09:30 AM",
                "16","Oct"
        ));
        return list;
    }


}