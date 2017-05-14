package com.example.android.androidmusicapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MediaStoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_store);

        ImageView shoppinga = (ImageView) findViewById(R.id.shoppinga);

        shoppinga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/music";
                Intent shoppingaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/music"));
                // Start the new activity
                startActivity(shoppingaIntent);
            }
        });
        ImageView shoppingb = (ImageView) findViewById(R.id.shoppingb);

        shoppingb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/music";
                Intent shoppingbIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/music"));
                // Start the new activity
                startActivity(shoppingbIntent);
            }
        });
        ImageView shoppingc = (ImageView) findViewById(R.id.shoppingc);

        shoppingc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/music";
                Intent shoppingcIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/music"));
                // Start the new activity
                startActivity(shoppingcIntent);
            }
        });
    }
}
