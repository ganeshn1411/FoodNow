package com.example.ganesh.fn;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class Main22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String value = new String("     Food           Quantity        Price          Delivery");
        TextView myTextView = (TextView)findViewById(R.id.listView);
        myTextView.setText(value);

        String[] values = new String[] {"Sushi                  8                  $4.99                   N","Noodles             3                  $5.99                   N","Sandwich         24                  $1.99                   N","Bagel                25                  $1.05                   N","Pretzels              21                  $1.5                   N","Noodles                2                  $6.99                   Y","Fruits             5                  $3.99                   N","Meatcake               3                  $4.6                   N"};
        ListView myListView = (ListView) findViewById(R.id.listView1);
        ArrayList liste = new ArrayList<String>();
        Collections.addAll(liste, values);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, liste);
        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id)
            {
                int pos=position+1;
                Toast.makeText(Main22Activity.this, Integer.toString(pos) + " Clicked", Toast.LENGTH_SHORT).show();
            }

        });
    }

}
