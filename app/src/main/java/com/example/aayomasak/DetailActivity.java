package com.example.aayomasak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.aayomasak.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        int gambar = getIntent().getIntExtra("gambar", 0);
        int usergambar = getIntent().getIntExtra("usergambar", 0);
        String namamakanan = getIntent().getStringExtra("namamakanan");
        String namuser = getIntent().getStringExtra("namaUser");

        String bahan = getIntent().getStringExtra("bahan");
        String caramembuat = getIntent().getStringExtra("mebuat");



        binding.imageView2.setImageResource(gambar);
        binding.profile.setImageResource(usergambar);
        binding.textView.setText(namamakanan);
        binding.username.setText(namuser);
        binding.bahanDesc.setText(bahan);
        binding.caraDesc.setText(caramembuat);


    }
}