package com.example.dangnguyenhai.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;

    private Animation animation1;
    private Animation animation2;
    private Animation animation3;
    private Animation animation4;
    private Animation animation5;
    private Animation animation6;
    private Animation animation7;
    private Animation animation8;

    private String value;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_background);

        textView1 = (TextView) findViewById(R.id.tv1);
        textView2 = (TextView) findViewById(R.id.tv2);
        textView3 = (TextView) findViewById(R.id.tv3);
        textView4 = (TextView) findViewById(R.id.tv4);
        textView5 = (TextView) findViewById(R.id.tv5);
        textView6 = (TextView) findViewById(R.id.tv6);
        textView7 = (TextView) findViewById(R.id.tv7);
        textView8 = (TextView) findViewById(R.id.tv8);

        animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move1_anim);
        animation2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move2_anim);
        animation3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move3_anim);
        animation4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move4_anim);
        animation5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move5_anim);
        animation6 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move6_anim);
        animation7 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move7_anim);
        animation8 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move8_anim);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    textView1.startAnimation(animation1);
                    textView2.startAnimation(animation2);
                    textView3.startAnimation(animation3);
                    textView4.startAnimation(animation4);
                    textView5.startAnimation(animation5);
                    textView6.startAnimation(animation6);
                    textView7.startAnimation(animation7);
                    textView8.startAnimation(animation8);
                    Thread.sleep(4000);
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                } catch (InterruptedException ex) {
                    Log.d("Error", ex.getMessage());
                }
            }
        }).start();

     }

}
