package com.oguzavanoglu.landmarkjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.oguzavanoglu.landmarkjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<Landmark>();

        Landmark pisa = new Landmark("Pisa","Italy",R.drawable.pissa);
        Landmark eyfel = new Landmark("Eiffel","France",R.drawable.eyfel);
        Landmark londonBridge = new Landmark("LondonBridge","UK",R.drawable.london);
        Landmark kolezyum = new Landmark("Collesseum","Italy",R.drawable.kolezyum);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eyfel);
        landmarkArrayList.add(londonBridge);
        landmarkArrayList.add(kolezyum);


        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,
                //Mapping
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("landmark",landmarkArrayList.get(position)); //Serializable
                startActivity(intent);
            }
        });

    }

}