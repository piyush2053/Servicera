package com.example.serviceraF;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class bhopal extends AppCompatActivity implements View.OnClickListener {

    public CardView c1,c2,c3,c4,c5,c6,c7,c8,c9;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhopal);

        c1 = (CardView) findViewById(R.id.b_carp);
        c2 = (CardView) findViewById(R.id.b_elec);
        c3 = (CardView) findViewById(R.id.b_maid);
        c4 = (CardView) findViewById(R.id.b_brok);
        c5 = (CardView) findViewById(R.id.b_driv);
        c6 = (CardView) findViewById(R.id.b_plum);
        c7 = (CardView) findViewById(R.id.b_move);
        c8 = (CardView) findViewById(R.id.b_pain);
        c9 = (CardView) findViewById(R.id.b_key);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
        c8.setOnClickListener(this);
        c9.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

            Intent i;
            switch(view.getId()){
                case R.id.b_carp:
                    i = new Intent(this, Carpenter2.class);
                    startActivity(i);
                    break;
                case R.id.b_elec:
                    i = new Intent(this, Electrician2.class);
                    startActivity(i);
                    break;
                case R.id.b_maid:
                    i = new Intent(this, Maid2.class);
                    startActivity(i);
                    break;
                case R.id.b_brok:
                    i = new Intent(this, Broker2.class);
                    startActivity(i);
                    break;
                case R.id.b_driv:
                    i = new Intent(this, Driver2.class);
                    startActivity(i);
                    break;
                case R.id.b_plum:
                    i = new Intent(this, Plumber2.class);
                    startActivity(i);
                    break;
                case R.id.b_move:
                    i = new Intent(this, Movers2.class);
                    startActivity(i);
                    break;
                case R.id.b_pain:
                    i = new Intent(this, Painter2.class);
                    startActivity(i);
                    break;
                case R.id.b_key:
                    i = new Intent(this, Key2.class);
                    startActivity(i);
                    break;
            }
    }
}