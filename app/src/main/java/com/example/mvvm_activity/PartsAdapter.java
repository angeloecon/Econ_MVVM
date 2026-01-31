package com.example.mvvm_activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PartsAdapter extends RecyclerView.Adapter<PartsAdapter.PartViewHolder> {

    private List<PartsModel> partsList;

    public PartsAdapter(Context applicationContext, List<PartsModel> partsList) {
        this.partsList = partsList;
    }

    @NonNull
    @Override
    public PartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.parts_layout, parent, false);
        return new PartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PartViewHolder holder, int position) {
        PartsModel part = partsList.get(position);

        holder.partName.setText(part.getPartsName());
        holder.part.setText(part.getPart());
        holder.partImage.setImageResource(part.getPartImage());
    }

    @Override
    public int getItemCount() {
        return partsList.size();
    }

    public static class PartViewHolder extends RecyclerView.ViewHolder {
        TextView partName, part;
        ImageView partImage;

        public PartViewHolder(@NonNull View itemView) {
            super(itemView);
            partName = itemView.findViewById(R.id.partName);
            part = itemView.findViewById(R.id.part);
            partImage = itemView.findViewById(R.id.partImage);
        }
    }
}