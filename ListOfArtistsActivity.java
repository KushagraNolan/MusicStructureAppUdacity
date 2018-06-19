package com.example.kushagrasrivastava.musicstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ListOfArtistsActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_artists);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(getResources().getString(R.string.category_listofartists));
        ImageView imageView = (ImageView) findViewById(R.id.imgPlayImage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListOfArtistsActivity.this, "Image depicting list of artists", Toast.LENGTH_LONG).show();
            }
        });


        Button button = (Button) findViewById(R.id.btnSecondActivity);
        //button.setOnClickListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentArtist = new Intent(view.getContext(), ArtistsActivity.class);
                startActivity(intentArtist);
            }
        });

    }
}
