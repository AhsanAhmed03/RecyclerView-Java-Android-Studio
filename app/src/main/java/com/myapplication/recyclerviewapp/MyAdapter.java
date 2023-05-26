package com.myapplication.recyclerviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewholder> {

    Context context;
    ArrayList<String> compnyName = new ArrayList<>();

    public MyAdapter(Context context,ArrayList<String> compnyName){
        this.context = context;
        this.compnyName = compnyName;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_mainactivity,parent,false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {

        holder.names.setText(compnyName.get(position));

    }

    @Override
    public int getItemCount() {
        return compnyName.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder{
        TextView names;

        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            names = itemView.findViewById(R.id.compnyNames);
        }
    }
}
