package com.example.recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        // Ambil data mahasiswa yang dikirim dari MainActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nama = extras.getString("nama");
            String nim = extras.getString("nim");
            int fotoResId = extras.getInt("foto");

            // Tampilkan data mahasiswa di layout
            TextView textViewNama = findViewById(R.id.textViewNama);
            TextView textViewNim = findViewById(R.id.textViewNim);
            ImageView imageViewFoto = findViewById(R.id.imageViewFoto);

            textViewNama.setText(nama);
            textViewNim.setText(nim);
            imageViewFoto.setImageResource(fotoResId);
        }
    }
}
