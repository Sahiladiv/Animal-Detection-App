package com.example.imgp;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.support.v4.app.*;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import org.w3c.dom.Text;

public class AnimalInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_information);
        Intent intent = getIntent();
        String commonName = intent.getStringExtra("Common Name");
        TextView animal = (TextView)findViewById(R.id.animalName);
        animal.setText(commonName);
        commonName = commonName.toLowerCase();
        TextView cn = (TextView)findViewById(R.id.commonName);
        TextView sn = (TextView)findViewById(R.id.scientificName);
        TextView fd = (TextView)findViewById(R.id.food);
        TextView ltion = (TextView)findViewById(R.id.location);

        DocumentReference docref = FirebaseFirestore.getInstance().collection("animals").document(commonName);
        docref.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override

            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot doc = task.getResult();
                    if(doc.exists()){


                        String common = (String) doc.get("Common_Name");
                        String scientific = (String)doc.get("Scientific_Name");
                        String foodEaten = (String) doc.get("Food");
                        String locationFound = (String)doc.get("Location");
 
                        cn.setText(common);
                        cn.setAutoSizeTextTypeUniformWithConfiguration(12,14,2,1);
                        sn.setText(scientific);
                        sn.setAutoSizeTextTypeUniformWithConfiguration(12,14,2,1);
                        fd.setText(foodEaten);
                        fd.setAutoSizeTextTypeUniformWithConfiguration(12,14,2,1);
                        ltion.setText(locationFound);
                        ltion.setAutoSizeTextTypeUniformWithConfiguration(12,14,2,1);



                    }
                    else{
                        String t = "No data";

                        Log.d("Error:","No data");
                    }

                }



            }
        });
    }
}