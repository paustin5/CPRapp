package com.example.paustin5.cprapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IntroPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intropage);
    }
    public void nextView(View view) {
        Intent intent = new Intent(this, IntroPage2.class);
        startActivity(intent);
    }
    public void previousView(View view) {
        Intent intent = new Intent(this, WelcomePage.class);
        startActivity(intent);
    }
}
