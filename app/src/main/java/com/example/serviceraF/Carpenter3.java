package com.example.serviceraF;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Carpenter3 extends AppCompatActivity {

    String[] services = new String[]{
            "Mr.Hariom Vishwakarma",
            "Mr.nancy Vishwakarma",
            "Mr.prachi Vishwakarma",
            "Mr.manoj Vishwakarma",
            "Mr.mass Vishwakarma",
            "Mr.binod Vishwakarma",
            "Mr.ssa Vishwakarma",
            "Mr.jjj Vishwakarma",
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
            "Hii THERE",
            "Hii THERE",
            "Hii nasp",
            "Hii THERE.",
            "Hii THERE.",
            "Hii THERE ",
            "Hii THERE.",
            "Hii THERE",
            "Hii THERE"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpenter3);
        // Each row in the list stores country name, currency and flag
        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 9; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("txt", "" + services[i]);
            hm.put("description", "" + description[i]);
            hm.put("icon", Integer.toString(icon[i]));
            aList.add(hm);
        }
        // Keys used in Hashmap
        String[] from = {"icon", "txt", "description"};

        // Ids of views in listview_layout
        int[] to = {R.id.icon, R.id.txt, R.id.phone};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_layout2, from, to);

        // Getting a reference to listview of main.xml layout file
        ListView listView = (ListView) findViewById(R.id.list_contacts);

        // Setting the adapter to the listView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "999999999"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 1) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 2) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 3) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 4) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 5) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 6) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 7) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    // Send phone number to intent as data
                    intent.setData(Uri.parse("tel:" + "9479607795"));
                    // Start the dialer app activity with number
                    startActivity(intent);
                }
                if (i == 8) {
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