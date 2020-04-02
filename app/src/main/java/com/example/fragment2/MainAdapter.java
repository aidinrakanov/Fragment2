package com.example.fragment2;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {


    ArrayList<String> data;

    public MainAdapter() {
        data = new ArrayList<>();
    }
    Detail_number detail_number;

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.view_holder_main, parent, false);
        MainViewHolder mvh = new MainViewHolder(v);
        mvh.detail_number = detail_number;
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.textView.setText(data.get(position));
        holder.name = holder.textView.getText().toString();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

