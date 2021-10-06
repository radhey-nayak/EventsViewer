package com.e_li.eventsviewer;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.TooltipCompat;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyDataHolder> {
    Context mContext;
    ArrayList<data> mData;
    public DataAdapter(Context mContext, ArrayList<data> mData) {
        this.mContext = mContext;
        this.mData = mData;
        System.out.println(mData.size());
    }

    @NonNull
    @Override
    public MyDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_item_design, parent, false);
        return new MyDataHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyDataHolder holder, int position) {

        holder.e_name.setText(mData.get(position).getName());
        holder.e_place.setText(mData.get(position).getLocation());
        holder.e_content.setText(mData.get(position).getContent());
        holder.e_schedule.setText(mData.get(position).getSchedule());

        holder.e_enroll.setOnClickListener(view -> {

            TooltipCompat.setTooltipText(holder.e_enroll, "Enroll");

        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyDataHolder extends RecyclerView.ViewHolder {

        TextView e_name, e_place, e_content, e_schedule;
        CardView e_enroll;
        public MyDataHolder(@NonNull View itemView) {
            super(itemView);

            e_name = itemView.findViewById(R.id.e_name);
            e_place = itemView.findViewById(R.id.e_place);
            e_content = itemView.findViewById(R.id.e_content);
            e_schedule = itemView.findViewById(R.id.e_schedule);
            e_enroll = itemView.findViewById(R.id.e_enroll);

        }
    }
}
