package com.example.randy.fabanimation;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab_plus, fab_twitter, fab_fb, fab_instagram;
    Animation fabOpen, fabClose, fabRClockwise, fabRAnticlockwise, fabOpen2, fabOpen3, fabClose2, fabClose3;
    boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab_plus = (FloatingActionButton) findViewById(R.id.fab_plus);
        fab_twitter = (FloatingActionButton) findViewById(R.id.fab_twitter);
        fab_fb = (FloatingActionButton) findViewById(R.id.fab_fb);
        fab_instagram = (FloatingActionButton) findViewById(R.id.fab_instagram);
        fabOpen = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fabClose = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        fabRClockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);
        fabRAnticlockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anticlockwise);
        fabOpen2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open2);
        fabOpen3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open3);
        fabClose2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close2);
        fabClose3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close3);

        fab_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isOpen) {
                    fab_fb.startAnimation(fabClose);
                    fab_twitter.startAnimation(fabClose3);
                    fab_instagram.startAnimation(fabClose2);
                    fab_plus.startAnimation(fabRAnticlockwise);
                    fab_twitter.setClickable(false);
                    fab_fb.setClickable(false);
                    isOpen = false;
                } else {
                    fab_fb.startAnimation(fabOpen3);
                    fab_twitter.startAnimation(fabOpen);
                    fab_instagram.startAnimation(fabOpen2);
                    fab_plus.startAnimation(fabRClockwise);
                    fab_twitter.setClickable(true);
                    fab_fb.setClickable(true);
                    isOpen = true;
                }
            }
        });

        fab_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "twitter is clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}
