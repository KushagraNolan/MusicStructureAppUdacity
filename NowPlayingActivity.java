package com.example.kushagrasrivastava.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_now_playing);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            setTitle(getResources().getString(R.string.category_nowPlaying));
            ImageView imageView=(ImageView)findViewById(R.id.imgPlayImage);

            imageView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    //imageView.setImageResource(Animal.animalImages[i]);
                    Toast.makeText(NowPlayingActivity.this,"Image depicting the current song being played ",Toast.LENGTH_LONG).show();
                }
            });


            Button artistButton = (Button) findViewById(R.id.btnArtists);
            Button albumButton = (Button) findViewById(R.id.btnAlbums);
            //Button nowPlayingButton = (Button) findViewById(R.id.btnNowPlaying);
            Button playlistButton = (Button) findViewById(R.id.btnPlayLists);
            Button homeScreenButton = (Button)findViewById(R.id.btnHomeScreen);

            artistButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentArtist = new Intent(view.getContext(), ArtistsActivity.class);
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

           /*
            nowPlayingButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intentNowPlaying = new Intent(view.getContext(), NowPlayingActivity.class);
                    startActivity(intentNowPlaying);
                }
            });
*/
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
