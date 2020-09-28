package com.example.serviceraF;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Homepage extends AppCompatActivity implements View.OnClickListener {

    public CardView c1,c2,c3,c4;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        c1 = (CardView) findViewById(R.id.ind);
        c2 = (CardView) findViewById(R.id.bhp);
        c3 = (CardView) findViewById(R.id.nsp);
        c4= (CardView) findViewById(R.id.about);

        c1.setOnClickListener(this);
        c4.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId()) {
            case R.id.ind:
                i = new Intent(this, indore.class);
                startActivity(i);
                break;
            case R.id.bhp:
                i = new Intent(this, bhopal.class);
                startActivity(i);
                break;
            case R.id.nsp:
                i = new Intent(this, narsinghpur.class);
                startActivity(i);
                break;
            case R.id.about:
                i = new Intent(this,about_us.class);
                startActivity(i);
                break;
        }


    }
}