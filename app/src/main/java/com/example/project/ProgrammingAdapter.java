package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<ProgrammingLanguages> mProgrammingData;

    public ProgrammingAdapter(ArrayList<ProgrammingLanguages> mProgrammingData) {
        this.mProgrammingData = mProgrammingData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row, parent, false);
        return new ProgrammingAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.name.setText(mProgrammingData.get(position).getName());
        holder.location.setText(mProgrammingData.get(position).getLocation());
        holder.company.setText(mProgrammingData.get(position).getCompany());
        holder.size.setText(mProgrammingData.get(position).getSize());

        /*Glide.with(mContext)
                .load(mProgrammingData.get(position).getAuxdata())
                .into(holder.auxdata);

         */
    }

    @Override
    public int getItemCount() {
        return mProgrammingData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView company;
        TextView location;
        TextView size;
        // ImageView auxdata;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_txt);
            location = itemView.findViewById(R.id.location_txt);
            company = itemView.findViewById(R.id.company_txt);
            size = itemView.findViewById(R.id.size_txt);
        }
    }
}
