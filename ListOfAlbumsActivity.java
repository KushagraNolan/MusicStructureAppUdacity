package com.example.kushagrasrivastava.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ListOfAlbumsActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_albums);
        ImageView imageView = (ImageView) findViewById(R.id.imgPlayImage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //imageView.setImageResource(Animal.animalImages[i]);
                Toast.makeText(ListOfAlbumsActivity.this, "Image depicting list of albums", Toast.LENGTH_LONG).show();
            }
        });


        Button button = (Button) findViewById(R.id.btnSecondActivity);

        //button.setOnClickListener(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAlbum = new Intent(view.getContext(), AlbumsActivity.class);
                startActivity(intentAlbum);
            }
        });

    }




}

