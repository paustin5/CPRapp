package com.example.paustin5.cprapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;
public class BeforeCPR1 extends AppCompatActivity {
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.before_cpr1);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(BeforeCPR1.this, BeforeCPR2.class);
                startActivity(intent);
                finish();
            }
        }, 7000);
    }
    public void cpr1ToCpr2(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void cpr1toMain(View view) {
        Intent intent = new Intent(this, BeforeCPR2.class);
        startActivity(intent);
    }
}
