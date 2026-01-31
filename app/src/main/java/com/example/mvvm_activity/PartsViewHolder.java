package com.example.mvvm_activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PartsViewHolder extends RecyclerView.ViewHolder {

    ImageView imagePart;
    TextView partName, part;

    public PartsViewHolder(@NonNull View itemView) {
        super(itemView);
        imagePart = itemView.findViewById(R.id.partImage);
        partName = itemView.findViewById(R.id.partName);
        part = itemView.findViewById(R.id.part);
    }
}