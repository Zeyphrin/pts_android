package com.example.aayomasak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.annotation.SuppressLint;
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



        ArrayList<Hero> data = getListHero();


        HeroAdapter heroAdapter = new HeroAdapter(data);


        binding.rvHero.setLayoutManager(new GridLayoutManager(this,3));

        binding.rvHero.setAdapter(heroAdapter);

    }


    private ArrayList<Hero> getListHero(){
        String[] foodName = getResources().getStringArray(R.array.data_name);
        String[] foodNameCreator = getResources().getStringArray(R.array.data_name);
        TypedArray foodPoster = getResources().obtainTypedArray(R.array.data_photo);
        TypedArray foodCreator = getResources().obtainTypedArray(R.array.data_photo);

        ArrayList<Hero> heroes = new ArrayList<>();

        Hero hero = new Hero();

        for(int i = 0; i < foodName.length;i++){
            hero.setName(foodName[i]);
            hero.setUser(foodNameCreator[i]);
            hero.setFoodPoster(foodPoster.getResourceId(i,0));
            hero.setUserPoster(foodCreator.getResourceId(i,0));
            heroes.add(hero);
        }

        return heroes;
    }
}