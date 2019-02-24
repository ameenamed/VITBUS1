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
            Intent intent=new Intent(v.getContext(),Main6Activity.class);
            v.getContext().startActivity(intent);

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
