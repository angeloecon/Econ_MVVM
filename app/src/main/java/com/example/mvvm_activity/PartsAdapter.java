package com.example.mvvm_activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PartsAdapter extends RecyclerView.Adapter<PartsViewHolder> {

    private final List<PartsModel> partsList;

    public PartsAdapter(List<PartsModel> partsList) {
        this.partsList = partsList;
    }

    @NonNull
    @Override
    public PartsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.parts_layout, parent, false);
        return new PartsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PartsViewHolder holder, int position) {
        PartsModel part = partsList.get(position);

        holder.partName.setText(part.getPartsName());
        holder.part.setText(part.getPart());
        holder.imagePart.setImageResource(part.getPartImage());
    }

    @Override
    public int getItemCount() {
        return partsList.size();
    }
}