package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {


    Context context;
    List<Mahasiswa> Mahasiswas;

    public Adapter(Context context, List<Mahasiswa> Mahasiswas) {
        this.context = context;
        this.Mahasiswas = Mahasiswas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nameView.setText(Mahasiswas.get(position).getNama());
        holder.nimView.setText(Mahasiswas.get(position).getNim());
        holder.FotoView.setImageResource(Mahasiswas.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return Mahasiswas.size();
    }
}