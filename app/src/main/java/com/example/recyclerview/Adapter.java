package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    private Context context;
    private List<Mahasiswa> mahasiswas;

    public Adapter(Context context, List<Mahasiswa> mahasiswas) {
        this.context = context;
        this.mahasiswas = mahasiswas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Mahasiswa currentMahasiswa = mahasiswas.get(position);
        holder.nameView.setText(currentMahasiswa.getNama());
        holder.nimView.setText(currentMahasiswa.getNim());
        holder.FotoView.setImageResource(currentMahasiswa.getFoto());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kirim data mahasiswa yang diklik ke halaman selanjutnya
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("nama", currentMahasiswa.getNama());
                intent.putExtra("nim", currentMahasiswa.getNim());
                intent.putExtra("foto", currentMahasiswa.getFoto());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // Tambahkan flag FLAG_ACTIVITY_NEW_TASK
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mahasiswas.size();
    }
}
