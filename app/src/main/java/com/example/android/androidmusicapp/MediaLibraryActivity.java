package com.example.android.androidmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MediaLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_library);

        TextView song_list = (TextView) findViewById(R.id.song_list);

        song_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Lists the songs", Toast.LENGTH_SHORT).show();
            }
        });

        TextView artist_list = (TextView) findViewById(R.id.artist_list);

        artist_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Lists the artists", Toast.LENGTH_SHORT).show();
            }
        });

        TextView genre_list = (TextView) findViewById(R.id.genre_list);

        genre_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Lists the genres", Toast.LENGTH_SHORT).show();
            }
        });

        TextView album_list = (TextView) findViewById(R.id.album_list);

        album_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Lists the albums", Toast.LENGTH_SHORT).show();
            }
        });

        TextView published_list = (TextView) findViewById(R.id.published_list);

        published_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Lists the publish dates", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView acdc = (ImageView) findViewById(R.id.acdc);

        acdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acdcIntent = new Intent(MediaLibraryActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(acdcIntent);
            }
        });

        ImageView matchbox = (ImageView) findViewById(R.id.matchbox);

        matchbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent matchboxIntent = new Intent(MediaLibraryActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(matchboxIntent);
            }
        });

        ImageView beatles = (ImageView) findViewById(R.id.beatles);

        beatles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beatlesIntent = new Intent(MediaLibraryActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(beatlesIntent);
            }
        });
    }
}
