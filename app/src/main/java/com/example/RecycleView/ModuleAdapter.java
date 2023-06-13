package com.example.RecycleView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModuleAdapter extends RecyclerView.Adapter<ModuleAdapter.ViewHolder> {

    private ArrayList<Modules> modulesList;
    Activity activity;

    public ModuleAdapter(ArrayList<Modules> modulesList, Activity activity) {
        this.modulesList = modulesList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.modules_items, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Modules modules = modulesList.get(position);

        holder.imgImage.setImageResource(modules.getImage());
        holder.tvName.setText(modules.getName());
        holder.tvTitle.setText(modules.getTitle());
        holder.tvDescription.setText(modules.getDescription());

        holder.imgImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("Title", holder.tvTitle.getText().toString());
                activity.setResult(2, intent);
                activity.finish();
            }
        });
    }

    @Override
    public int getItemCount() {
        return modulesList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgImage;
        TextView tvTitle;
        TextView tvDescription;
        TextView tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgImage = itemView.findViewById(R.id.ivImage);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
