package com.example.android.vitbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    private ArrayList<String> mNames=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        initroutes();
    }
    private void initroutes()
    {
        mNames.add("Route 1");
        mNames.add("Route 2");
        mNames.add("Route 3");mNames.add("Route 3");mNames.add("Route 3");mNames.add("Route 4");mNames.add("Route 5");mNames.add("Route 6");
        mNames.add("Route 7");mNames.add("Route 8");mNames.add("Route 9");mNames.add("Route 10");mNames.add("Route 11");mNames.add("Route 12");
        mNames.add("Route 13");mNames.add("Route 14");mNames.add("Route 15");mNames.add("Route 16");mNames.add("Route 17");mNames.add("Route 18");
        mNames.add("Route 19");mNames.add("Route 20");
        initRecyclerView();

    }
    private void initRecyclerView()
    {
        RecyclerView recyclerView=findViewById(R.id.recylerview);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(mNames,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
