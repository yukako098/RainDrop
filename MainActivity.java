package com.example.yuka.raindropsexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private AnimationHelper mAnimationHelper;
    private Button startBtn;
    private Button stopBtn;
    private RainDrops rainDrops;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startBtn = findViewById(R.id.start_btn);
        stopBtn = findViewById(R.id.stop_btn);
        rainDrops = findViewById(R.id.rain_drops);

        mAnimationHelper = new AnimationHelper(rainDrops, 50);


        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnimationHelper.start();
            }
        });

        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnimationHelper.stop();
            }
        });

    }




}
