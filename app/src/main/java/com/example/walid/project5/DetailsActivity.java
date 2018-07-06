package com.example.walid.project5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    String location = "";
    String title = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        ImageView img = findViewById(R.id.img);
        TextView details = findViewById(R.id.detailsText);
        setSupportActionBar(toolbar);
        if (getIntent().hasExtra("title")) {
            title = getIntent().getStringExtra("title");
            getSupportActionBar().setTitle(title);
        }
        if (getIntent().hasExtra("details")) {
            details.setText(getIntent().getIntExtra("details", R.string.lorem_ipsum));
        }
        if (getIntent().hasExtra("img")) {
            img.setImageResource(getIntent().getIntExtra("img", R.drawable.corso_beach));
        }
        if (getIntent().hasExtra("location")) {
            location = getIntent().getStringExtra("location");
        }
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" + location + "?q=" + location + "(" + title + ")"));
                if (getPackageManager().queryIntentActivities(intent, 0).size() > 0)
                    startActivity(intent);
                else
                    Snackbar.make(view, R.string.no_maps_app, Snackbar.LENGTH_SHORT).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}