package com.laptop.myintroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {
    TextView tvFacebook,tvInstagram, tvCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        tvFacebook= findViewById(R.id.tvFacebook);
        tvInstagram = findViewById(R.id.tvInstagram);
        tvCall = findViewById(R.id.tvCall);

        tvFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ar.rahman.9465/"));
                startActivity(browserIntent);
            }
        });

        tvInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ab_rahman_araka/"));
                startActivity(browserIntent);
            }
        });



    }
}