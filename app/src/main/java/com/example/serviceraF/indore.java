package com.example.serviceraF;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.example.serviceraF.R.id.b_driv;

public class indore extends AppCompatActivity implements View.OnClickListener {

    public CardView c1,c2,c3,c4,c5,c6,c7,c8,c9;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indore2);

        c1 = (CardView) findViewById(R.id.i_carp);
        c2 = (CardView) findViewById(R.id.i_elec);
        c3 = (CardView) findViewById(R.id.i_maid);
        c4 = (CardView) findViewById(R.id.i_brok);
        c5 = (CardView) findViewById(R.id.i_driv);
        c6 = (CardView) findViewById(R.id.i_plum);
        c7 = (CardView) findViewById(R.id.i_move);
        c8 = (CardView) findViewById(R.id.i_pain);
        c9 = (CardView) findViewById(R.id.i_key);

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
        switch(view.getId()) {
            case R.id.i_carp:
                i = new Intent(this, CarpenterInd.class);
                startActivity(i);
                break;
            case R.id.i_elec:
                i = new Intent(this, ElectricianInd.class);
                startActivity(i);
                break;
            case R.id.i_maid:
                i = new Intent(this, MaidInd.class);
                startActivity(i);
                break;
            case R.id.i_brok:
                i = new Intent(this, BrokerInd.class);
                startActivity(i);
                break;
            case R.id.i_driv:
                i = new Intent(this, Driver1.class);
                startActivity(i);
                break;
            case R.id.i_plum:
                i = new Intent(this, Plumber1.class);
                startActivity(i);
                break;
            case R.id.i_move:
                i = new Intent(this, Movers1.class);
                startActivity(i);
                break;
            case R.id.i_pain:
                i = new Intent(this, Painter1.class);
                startActivity(i);
                break;
            case R.id.i_key:
                i = new Intent(this, Key1.class);
                startActivity(i);
                break;
        }
    }
}