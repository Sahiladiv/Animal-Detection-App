package com.example.imgp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

<<<<<<< Updated upstream
import androidx.annotation.NonNull;
<<<<<<< HEAD
import androidx.annotation.RequiresApi;
=======
=======
>>>>>>> Stashed changes
>>>>>>> Second
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;



public class SearchedAnimal extends AppCompatActivity {
<<<<<<< Updated upstream
    ArrayList <String> details;
<<<<<<< HEAD
    @RequiresApi(api = Build.VERSION_CODES.O)
=======
=======

>>>>>>> Stashed changes
>>>>>>> Second
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searched_animal);
        Intent intent = getIntent();
        String common = intent.getStringExtra("Common Name");
        String scientific = intent.getStringExtra("Scientific Name");
        String foodEaten = intent.getStringExtra("Food");
        String locationFound = intent.getStringExtra("Location");
        TextView animal = (TextView)findViewById(R.id.animalName);
        animal.setText(common);
        TextView cn = (TextView)findViewById(R.id.commonName);
        TextView sn = (TextView)findViewById(R.id.scientificName);
        TextView fd = (TextView)findViewById(R.id.food);
        TextView ltion = (TextView)findViewById(R.id.location);
<<<<<<< HEAD


=======
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
>>>>>>> Second
        cn.setText(common);
        cn.setAutoSizeTextTypeUniformWithConfiguration(12,14,2,1);
        sn.setText(scientific);
        sn.setAutoSizeTextTypeUniformWithConfiguration(12,14,2,1);

        fd.setText(foodEaten);
        fd.setAutoSizeTextTypeUniformWithConfiguration(12,14,2,1);

        ltion.setText(locationFound);
<<<<<<< HEAD
        ltion.setAutoSizeTextTypeUniformWithConfiguration(12,14,2,1);
=======
<<<<<<< Updated upstream
>>>>>>> Second


=======
>>>>>>> Stashed changes
    }

}