package com.example.paustin5.cprapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import java.util.TimerTask;
public class MainActivity extends AppCompatActivity {
//    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(MainActivity.this, IntroPage.Class);
//                startActivity(intent);
//                finish();
//            }
//        }, 5000);
    }
}
