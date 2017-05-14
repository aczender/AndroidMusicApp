package com.example.android.androidmusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the library category
        TextView library = (TextView) findViewById(R.id.library);

        // Set a click listener on that View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MediaLibraryActivity}
                Intent libraryIntent = new Intent(MainActivity.this, MediaLibraryActivity.class);

                // Start the new activity
                startActivity(libraryIntent);
            }
        });

        // Find the View that shows the store category
        TextView store = (TextView) findViewById(R.id.store);

        // Set a click listener on that View
        store.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the store category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MediaStoreActivity}
                Intent storeIntent = new Intent(MainActivity.this, MediaStoreActivity.class);

                // Start the new activity
                startActivity(storeIntent);
            }
        });

        // Find the View that shows the playing category
        TextView playing = (TextView) findViewById(R.id.playing);

        // Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent playingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(playingIntent);
            }
        });
    }
}
