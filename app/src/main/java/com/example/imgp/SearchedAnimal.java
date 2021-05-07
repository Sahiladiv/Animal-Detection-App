package com.example.imgp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

<<<<<<< Updated upstream
import androidx.annotation.NonNull;
=======
>>>>>>> Stashed changes
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;



public class SearchedAnimal extends AppCompatActivity {
<<<<<<< Updated upstream
    ArrayList <String> details;
=======

>>>>>>> Stashed changes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searched_animal);
        Intent intent = getIntent();
        String common = intent.getStringExtra("Common Name");
        String scientific = intent.getStringExtra("Scientific Name");
        String foodEaten = intent.getStringExtra("Food");
        String locationFound = intent.getStringExtra("Location");

        TextView cn = (TextView)findViewById(R.id.commonName);
        TextView sn = (TextView)findViewById(R.id.scientificName);
        TextView fd = (TextView)findViewById(R.id.food);
        TextView ltion = (TextView)findViewById(R.id.location);
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
        cn.setText(common);
        sn.setText(scientific);
        fd.setText(foodEaten);
        ltion.setText(locationFound);
<<<<<<< Updated upstream

//        DocumentReference docref = FirebaseFirestore.getInstance().collection("animals").document(searchText);
//        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
//            @Override
//
//            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
//                if(task.isSuccessful()){
//                    DocumentSnapshot doc = task.getResult();
//                    if(doc.exists()){
//
//
//                        String common = (String) doc.get("Common_Name");
//                        String scientific = (String)doc.get("Scientific_Name");
//                        String foodEaten = (String) doc.get("Food");
//                        String locationFound = (String)doc.get("Location");
//
//                        cn.setText(common);
//                        sn.setText(scientific);
//                        fd.setText(foodEaten);
//                        ltion.setText(locationFound);
//
//
//
//                    }
//                    else{
//                        String t = "No data";
//
//                        Log.d("Error:","No data");
//                    }
//
//                }
//
//
//
//            }
//        });

=======
>>>>>>> Stashed changes
    }

}