package com.example.paustin5.cprapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mainToIntro(View view) {
        Intent intent = new Intent(this, IntroPage.class);
        startActivity(intent);
    }
    public void mainToLive(View view) {
        Intent intent = new Intent(this, BeforeCPR1.class);
        startActivity(intent);
    }
}
