package com.example.aayomasak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;

import com.example.aayomasak.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



    }


    private ArrayList<Hero> getListHero(){
        String[] dataName = getResources().getStringArray(R.array.data_name);
        TypedArray dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
        TypedArray dataPhoto_Episode = getResources().obtainTypedArray(R.array.data_photo_episode);


        ArrayList<Hero> heroes = new ArrayList<>();








        return heroes;
    }
}