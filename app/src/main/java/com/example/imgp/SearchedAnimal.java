package com.example.imgp;


import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.Map;

public class SearchedAnimal extends AppCompatActivity {
    ArrayList <String> details;
    @RequiresApi(api = Build.VERSION_CODES.O)
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


        cn.setText(common);
        cn.setAutoSizeTextTypeUniformWithConfiguration(12,14,2,1);
        sn.setText(scientific);
        sn.setAutoSizeTextTypeUniformWithConfiguration(12,14,2,1);

        fd.setText(foodEaten);
        fd.setAutoSizeTextTypeUniformWithConfiguration(12,14,2,1);

        ltion.setText(locationFound);
        ltion.setAutoSizeTextTypeUniformWithConfiguration(12,14,2,1);


    }


}