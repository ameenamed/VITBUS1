package com.example.android.vitbus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void route8(View view)
    {
        Intent intent=new Intent(this,route8.class);
        startActivity(intent);
    }

    public void route16(View view)
    {
        Intent intent=new Intent(this,route16.class);
        startActivity(intent);

    }
}
