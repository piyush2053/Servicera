package com.example.serviceraF;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.serviceraF.Homepage;
import com.example.serviceraF.R;

public class MainActivity extends AppCompatActivity {

    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {

// Using handler with postDelayed called runnable run method

            @Override

            public void run() {

                Intent i = new Intent(MainActivity.this, Homepage.class);

                startActivity(i);

                // close this activity

                finish();

            }

        }, 1000); // wait for 1.5 seconds

    }
}