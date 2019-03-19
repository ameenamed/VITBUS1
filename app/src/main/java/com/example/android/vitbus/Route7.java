package com.example.android.vitbus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;


public class Route7 extends AppCompatActivity {
    private Firebase mRef;
    private ArrayList<String> lat = new ArrayList<>();
    private ArrayList<String> mkeys = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Firebase.setAndroidContext(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route7);

    }
    public void chinmiyanagar(View view)
    {
        LatLng g=new LatLng(13.06307, 80.19785);
        LatLng curr =new LatLng(Double.parseDouble(lat.get(0)),Double.parseDouble(lat.get(1)));

        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("bool","1");
        intent.putExtra("lata","13.06307");
        intent.putExtra("latb","80.19785");
        startActivity(intent);



    }
    public void virugampakkam(View view)
    {
        LatLng g=new LatLng(13.046306,80.190111);
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("bool","1");
        intent.putExtra("lata","13.046306");
        intent.putExtra("latb","80.190111");
        startActivity(intent);

    }
    public void porur(View view)
    {
        LatLng g=new LatLng(13.034500,80.156500);
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("bool","1");
        intent.putExtra("lata","13.034500");
        intent.putExtra("latb","80.156500");
        startActivity(intent);


    }
    public void nanthambakkam(View view)
    {
        LatLng g=new LatLng(13.016800,80.189400);
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("bool","1");
        intent.putExtra("lata","13.016800");
        intent.putExtra("latb","80.189400");
        startActivity(intent);


    }
    public void kathipara(View view)
    {
        LatLng g=new LatLng(13.007300,80.201600);
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("bool","1");
        intent.putExtra("lata","13.007300");
        intent.putExtra("latb","80.201600");
        startActivity(intent);


    }
    public void pallavaram(View view)
    {
        LatLng g=new LatLng(12.968100,80.148700);
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("bool","1");
        intent.putExtra("lata","12.968100");
        intent.putExtra("latb","80.148700");
        startActivity(intent);
    }
    public void chrompet(View view)
    {
        LatLng g=new LatLng(12.95161,80.14097);
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("bool","1");
        intent.putExtra("lata","12.95161");
        intent.putExtra("latb","80.14097");
        startActivity(intent);


    }
    public void tambaram(View view)
    {

        LatLng g=new LatLng(12.925400,80.116700);
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("bool","1");
        intent.putExtra("lata","12.925400");
        intent.putExtra("latb","80.116700");
        startActivity(intent);
    }
    public void vit(View view)
    {
        LatLng g=new LatLng(12.840400,80.152500);
        Intent intent=new Intent(this,MapActivity.class);
        intent.putExtra("bool","1");
        intent.putExtra("lata","12.840400");
        intent.putExtra("latb","80.152500");
        startActivity(intent);
    }
}