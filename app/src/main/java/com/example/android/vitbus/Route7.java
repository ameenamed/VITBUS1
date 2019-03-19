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
        mRef = new Firebase("https://vitbus1.firebaseio.com/");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route7);
        mRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String value = dataSnapshot.getValue(String.class);
                lat.add(value);
                String key = dataSnapshot.getKey();
                mkeys.add(key);
                //arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                String value = dataSnapshot.getValue(String.class);
                String key = dataSnapshot.getKey();
                int index = mkeys.indexOf(key);
                lat.set(index, value);
                //arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
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

    }
    public void porur(View view)
    {
        LatLng g=new LatLng(13.034500,80.156500);


    }
    public void nanthambakkam(View view)
    {
        LatLng g=new LatLng(13.016800,80.189400);

    }
    public void kathipara(View view)
    {
        LatLng g=new LatLng(13.007300,80.201600);

    }
    public void pallavaram(View view)
    {
        LatLng g=new LatLng(12.968100,80.148700);
    }
    public void chrompet(View view)
    {
        LatLng g=new LatLng(12.95161,80.14097);

    }
    public void tambaram(View view)
    {

        LatLng g=new LatLng(12.925400,80.116700);
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