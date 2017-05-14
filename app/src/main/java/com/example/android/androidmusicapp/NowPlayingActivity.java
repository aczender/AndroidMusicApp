package com.example.android.androidmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_now_playing);

        ImageView shopping = (ImageView) findViewById(R.id.shopping);

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(NowPlayingActivity.this, MediaStoreActivity.class);
                // Start the new activity
                startActivity(shoppingIntent);
            }
        });

        ImageView play_song = (ImageView) findViewById(R.id.play_song);

        play_song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Plays the song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView rewind_song = (ImageView) findViewById(R.id.rewind_song);

        rewind_song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Rewinds the song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView forward_song = (ImageView) findViewById(R.id.forward_song);

        forward_song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Forwards the song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView pause_song = (ImageView) findViewById(R.id.pause_song);

        pause_song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Pauses the song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView mute_song = (ImageView) findViewById(R.id.mute_song);

        mute_song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Mutes the song", Toast.LENGTH_SHORT).show();
            }
        });
    }
}