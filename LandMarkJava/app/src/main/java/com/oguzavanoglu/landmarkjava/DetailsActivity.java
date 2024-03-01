package com.oguzavanoglu.landmarkjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.oguzavanoglu.landmarkjava.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {


    private ActivityDetailsBinding binding;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        Landmark selectedLandMark =(Landmark) intent.getSerializableExtra("landmark");

        binding.nameText.setText(selectedLandMark.name);
        binding.countryText.setText(selectedLandMark.country);
        binding.imageView.setImageResource(selectedLandMark.image);

    }


}