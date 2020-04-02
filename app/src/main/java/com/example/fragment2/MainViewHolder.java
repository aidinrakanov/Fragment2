package com.example.fragment2;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder{
    TextView textView;
    Detail_number detail_number;
    String name;

    public MainViewHolder(@NonNull final View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.holder_text_view);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detail_number.clickOn(name);
            }
        });
    }
}