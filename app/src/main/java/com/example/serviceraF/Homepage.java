package com.example.serviceraF;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;


public class Homepage extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {
    public CardView c1,c2,c3,c4;
    Button button;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Menu menu;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        textView=findViewById(R.id.textView);
        toolbar=findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_navigation_drawer, R.string.Close_navigation_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

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
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {super.onBackPressed();
        }
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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.email:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/html");
                intent.putExtra(Intent.EXTRA_EMAIL, "servicera2053@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Customer Support");
                intent.putExtra(Intent.EXTRA_TEXT, "Email Us At 'servicera2053@gmail.com'");
                startActivity(Intent.createChooser(intent, "Send Email"));
                break;

            case R.id.aboutusmenu:
                Intent intent1 = new Intent(Homepage.this, about_us.class);
                startActivity(intent1);
                break;

            case R.id.call_drawer:
                Intent intent2 = new Intent(Intent.ACTION_DIAL);
                intent2.setData(Uri.parse("tel:" + "8770162378"));
                startActivity(intent2);
                break;
            case R.id.nav_profile:
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/beingpiyushpatel/"));
                startActivity(viewIntent);
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;

    }
}