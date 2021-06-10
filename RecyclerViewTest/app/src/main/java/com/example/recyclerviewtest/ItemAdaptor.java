package com.example.recyclerviewtest;

import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public class ItemAdaptor extends RecyclerView.Adapter<ItemAdaptor.MyViewHolder> {



    @Override
    public ItemAdaptor.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ItemAdaptor.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}