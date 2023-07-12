package com.error41.blood_donaation.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.error41.blood_donaation.MainActivity;
import com.error41.blood_donaation.R;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler= new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity( new Intent(getApplicationContext(), LoginActivity.class));
            }
        },1000);

    }
}