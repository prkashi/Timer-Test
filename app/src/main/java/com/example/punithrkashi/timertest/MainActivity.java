package com.example.punithrkashi.timertest;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new CountDownTimer(10000,1000){

            public void onTick(long milliSecondsUntilDone){

                //count down is counting down

                Log.i("hi", "hi");

            }

            public void onFinish(){

                //count down is finished

                Log.i("end","end");

            }

        }.start();

       /* final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {

                //code to be done in every millisecond

                Log.i("Hi","Hello");
                handler.postDelayed(this,1000);
            }
        };

        handler.post(run);*/
    }
}
