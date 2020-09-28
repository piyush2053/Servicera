package com.example.serviceraF;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class CarpenterInd extends AppCompatActivity {



    String[] services = new String[] {
            "Mr.Hariom Vishwakarma",
            "Mr.nancy Vishwakarma",
            "Mr.prachi Vishwakarma",
            "Mr.manoj Vishwakarma",
            "Mr.manoj Vishwakarma",
            "Mr.binod Vishwakarma",
            "Mr.hjhjjj Vishwakarma",
            "Mr.xyx Vishwakarma",
            "Mr.Mohit Vishwakarma"
    };
    int[] icon = new int[]{
            R.drawable.vector_man,
            R.drawable.vector_man,
            R.drawable.vector_man,
            R.drawable.vector_man,
            R.drawable.vector_man,
            R.drawable.vector_man,
            R.drawable.vector_man,
            R.drawable.vector_man,
            R.drawable.vector_man,
            R.drawable.vector_man

    };
    String[] description = new String[]{
            "AREA - VIJAY NAGAR INDORE          Hii I am Hariom So talented or mai bht accha kaam karta hoon  Hariom So talented or mai b",
            "Hii THERE",
            "Hii THERE",
            "Hii THERE.",
            "Hii THERE.",
            "Hii THERE ",
            "Hii THERE.",
            "Hii THERE",
            "Hii THERE"
    };



@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpenter_ind);

        // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<9;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("txt", "" + services[i]);
            hm.put("description","" + description[i]);
            hm.put("icon", Integer.toString(icon[i]) );
            aList.add(hm);
        }
        // Keys used in Hashmap
        String[] from = { "icon","txt","description"};

        // Ids of views in listview_layout
        int[] to = { R.id.icon,R.id.txt,R.id.phone};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_layout2, from, to);

        // Getting a reference to listview of main.xml layout file
        ListView listView = ( ListView ) findViewById(R.id.list_contacts);

        // Setting the adapter to the listView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 1){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 2){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 3){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 4){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 5){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 6){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 7){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 8){
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
            }
        });

}


}