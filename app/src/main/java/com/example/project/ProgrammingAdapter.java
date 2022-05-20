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

import java.util.List;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.MyViewHolder> {

    private Context mContext;
    private List<ProgrammingLanguages> mProgrammingData;

    public ProgrammingAdapter(Context mContext, List<ProgrammingLanguages> mData) {
        this.mContext = mContext;
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

        holder.programmingName.setText(mProgrammingData.get(position).getProgrammingName());
        holder.programmingDescr.setText(mProgrammingData.get(position).getProgrammingDescr());

        Glide.with(mContext)
                .load(mProgrammingData.get(position).getImage())
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return mProgrammingData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView programmingName;
        TextView programmingDescr;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            programmingName = itemView.findViewById(R.id.programmingName_txt);
            programmingDescr = itemView.findViewById(R.id.programmingDescr_txt);
            image = itemView.findViewById(R.id.logo_img);
        }
    }
}
