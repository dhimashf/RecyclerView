package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Mahasiswa> Mahasiswas = new ArrayList<Mahasiswa>();
        Mahasiswas.add(new Mahasiswa("Abmi Sukma Edri", "12250120341", R.drawable.amiii));
        Mahasiswas.add(new Mahasiswa("Ahmad Kurniawan", "12250111514", R.drawable.ahmed));
        Mahasiswas.add(new Mahasiswa("Aufa Hajati", "12250120338", R.drawable.aufa));
        Mahasiswas.add(new Mahasiswa("Daffa Finanda", "12250111603", R.drawable.dapin));
        Mahasiswas.add(new Mahasiswa("Daffa Ikhwan Nurfauzan", "12250110979", R.drawable.dafuq));
        Mahasiswas.add(new Mahasiswa("Dwi Jelita Adhliyah", "12250120331", R.drawable.jelita));
        Mahasiswas.add(new Mahasiswa("Dwi Mahdini", "12250111298", R.drawable.dwik));
        Mahasiswas.add(new Mahasiswa("Fajri", "12250110382", R.drawable.fajri));
        Mahasiswas.add(new Mahasiswa("Fakhri", "12250111381", R.drawable.fakhri));
        Mahasiswas.add(new Mahasiswa("Farras Lathief", "12250111328", R.drawable.farras));
        Mahasiswas.add(new Mahasiswa("Gilang Ramadhan Indra", "12250111323", R.drawable.gilang));
        Mahasiswas.add(new Mahasiswa("Hafidz Alhadid Rahman", "12250111794", R.drawable.hafidz));
        Mahasiswas.add(new Mahasiswa("Haritsah Naufaldy", "12250110361", R.drawable.aldy));
        Mahasiswas.add(new Mahasiswa("M. Nabil Dawami", "12250111527", R.drawable.nabil));
        Mahasiswas.add(new Mahasiswa("Muh. Zaki Erbai Syas", "12250111134", R.drawable.zaki));
        Mahasiswas.add(new Mahasiswa("Muhammad Aditya Rinaldi", "12250111048", R.drawable.adit));
        Mahasiswas.add(new Mahasiswa("Muhammad Dhimas Hadid", "12250111231", R.drawable.dms));
        Mahasiswas.add(new Mahasiswa("Muhammad Faruq", "12250111791", R.drawable.faruqhz));
        Mahasiswas.add(new Mahasiswa("Muhammad Rafly ", "12250111489", R.drawable.rafly));
        Mahasiswas.add(new Mahasiswa("Nurika Dwi Wahyuni", "12250120360", R.drawable.nurika));
        Mahasiswas.add(new Mahasiswa("Ogya Secio Noegroho.s", "12250111346", R.drawable.ogi));
        Mahasiswas.add(new Mahasiswa("Rahma Laksita", "12250124357", R.drawable.rahma));
        Mahasiswas.add(new Mahasiswa("Surya Hidayatullah ", "12250111759", R.drawable.srya));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(), Mahasiswas));



    }
}
