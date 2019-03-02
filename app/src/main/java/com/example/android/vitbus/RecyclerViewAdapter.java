package com.example.android.vitbus;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";


    private ArrayList<String> mrouteNo=new ArrayList<>();
    private ArrayList<String> k=new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(ArrayList<String> mrouteNo,ArrayList<String>k, Context mContext) {
        this.mrouteNo = mrouteNo;
        this.mContext = mContext;
        this.k=k;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem,viewGroup,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.routeNo.setText(mrouteNo.get(i));
        viewHolder.destination.setText(k.get(i));
        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Log.d(TAG,""+mrouteNo.get(i));
            if(mrouteNo.get(i)=="Route 1"){
                Intent intent=new Intent(v.getContext(),Route1.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 2"){
                Intent intent=new Intent(v.getContext(),Route2.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 3"){
                Intent intent=new Intent(v.getContext(),Route3.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 4"){
                Intent intent=new Intent(v.getContext(),Route4.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 5"){
                Intent intent=new Intent(v.getContext(),Route5.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 6"){
                Intent intent=new Intent(v.getContext(),Route6.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 7"){
                Intent intent=new Intent(v.getContext(),Route7.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 8"){
                Intent intent=new Intent(v.getContext(),BusRoute8.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 9"){
                Intent intent=new Intent(v.getContext(),Route9.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 10"){
                Intent intent=new Intent(v.getContext(),Route10.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 11"){
                Intent intent=new Intent(v.getContext(),Route11.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 12"){
                Intent intent=new Intent(v.getContext(),Route12.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 13"){
                Intent intent=new Intent(v.getContext(),Route13.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 14"){
                Intent intent=new Intent(v.getContext(),Route14.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 15"){
                Intent intent=new Intent(v.getContext(),Route15.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 16"){
                Intent intent=new Intent(v.getContext(),BusRoute16.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 17"){
                Intent intent=new Intent(v.getContext(),Route17.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 18"){
                Intent intent=new Intent(v.getContext(),Route18.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 19"){
                Intent intent=new Intent(v.getContext(),Route19.class);
                v.getContext().startActivity(intent);
            }
            else if(mrouteNo.get(i)=="Route 20"){
                Intent intent=new Intent(v.getContext(),Route20.class);
                v.getContext().startActivity(intent);
            }

            }
        });

    }

    @Override
    public int getItemCount() {
        return mrouteNo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView routeNo;
        TextView destination;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            routeNo=itemView.findViewById(R.id.routename);
            destination=itemView.findViewById(R.id.busstops);
            parentLayout=itemView.findViewById(R.id.parent_layout);
        }

    }
}
