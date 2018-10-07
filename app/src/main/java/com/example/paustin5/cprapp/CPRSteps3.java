package com.example.paustin5.cprapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CPRSteps3 extends AppCompatActivity {
    MediaPlayer mp = MediaPlayer.create(this, R.raw.beats);
//    mp.setLooping(true);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cpr_steps3);
        mp.start();
    }
    public void toMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void mainToLive(View view) {
        Intent intent = new Intent(this, CPRSteps2.class);
        startActivity(intent);
    }


}
