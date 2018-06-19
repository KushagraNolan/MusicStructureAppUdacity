package com.example.kushagrasrivastava.musicstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(getResources().getString(R.string.category_artists));
        ImageView imageView=(ImageView)findViewById(R.id.imgPlayImage);
        imageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Toast.makeText(ArtistsActivity.this,"This is the activity which will possibly show the different sorts of artists,musical bands,movies, " +
                        "songs of which are present in your database",Toast.LENGTH_LONG).show();
            }
        });
        Button goToArtistButton = (Button) findViewById(R.id.btnArtists);
        Button albumButton = (Button) findViewById(R.id.btnAlbums);
        Button nowPlayingButton = (Button) findViewById(R.id.btnNowPlaying);
        Button playlistButton = (Button) findViewById(R.id.btnPlayLists);
        Button homeScreenButton = (Button)findViewById(R.id.btnHomeScreen);

        goToArtistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentArtist = new Intent(view.getContext(), ListOfArtistsActivity.class);
                startActivity(intentArtist);
            }
        });

        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAlbum = new Intent(view.getContext(), AlbumsActivity.class);
                startActivity(intentAlbum);
            }
        });

        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNowPlaying = new Intent(view.getContext(), NowPlayingActivity.class);
                startActivity(intentNowPlaying);
            }
        });

        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPlaylist = new Intent(view.getContext(), PlayListsActivity.class);
                startActivity(intentPlaylist);
            }
        });
        homeScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHomeScreen = new Intent(view.getContext(), MainActivity.class);
                startActivity(intentHomeScreen);
            }
        });
    }
}
