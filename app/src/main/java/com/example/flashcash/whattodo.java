package com.example.flashcash;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class whattodo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whattodo);

        ImageView getcash = (ImageView) findViewById(R.id.getcash);
        getcash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(whattodo.this, getcash.class);
                startActivity(i);
            }
        });

        ImageView deliverCash = (ImageView) findViewById(R.id.delivercash);
        deliverCash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(whattodo.this, delivercash.class);
                startActivity(i);
            }
        });
    }

}
