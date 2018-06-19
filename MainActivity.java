package com.example.kushagrasrivastava.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=(ImageView)findViewById(R.id.imgPlayImage);


        imageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //imageView.setImageResource(Animal.animalImages[i]);
                Toast.makeText(MainActivity.this,"This is the home screen from where you'll navigate to other screens",Toast.LENGTH_LONG).show();
            }
        });



        //Find the views that shows the NowPlaying category
        TextView nowPlaying=(TextView) findViewById(R.id.btnNowPlaying);
        //Set a clickListener object on that textView
        nowPlaying.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent nowPlayingIntent=new Intent(MainActivity.this,NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
        //Find the views that shows the playLists category
        TextView playlists=(TextView) findViewById(R.id.btnPlayLists);
        //Set a clickListener object on that textView
        playlists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent playListsIntent=new Intent(MainActivity.this,PlayListsActivity.class);
                startActivity(playListsIntent);
            }
        });
        //Find the views that shows the albums category
        TextView albums=(TextView) findViewById(R.id.btnAlbums);
        //Set a clickListener object on that textView
        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent albumsIntent=new Intent(MainActivity.this,AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });
        //Find the views that shows the Artists category
        TextView artists=(TextView) findViewById(R.id.btnArtists);
        //Set a clickListener object on that textView
       artists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent artistsIntent=new Intent(MainActivity.this,ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });
        TextView payment=(TextView) findViewById(R.id.btnPaymentActivity);
        //Set a clickListener object on that textView
        payment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent paymentIntent=new Intent(MainActivity.this,PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
