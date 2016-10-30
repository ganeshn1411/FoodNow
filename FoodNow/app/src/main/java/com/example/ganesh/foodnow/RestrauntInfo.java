package com.example.ganesh.foodnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RestrauntInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restraunt_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        ImageView restrauntImage = (ImageView)findViewById(R.id.imageView2);
        restrauntImage.setImageResource(R.drawable.kabuki);

        String[] values = {"Restaurant",":","SushiFoo","Cuisine",":","Japanese","Rating",":","4.5","Distance",":","0.3 miles"};
        GridView gv = (GridView)findViewById(R.id.gridView);
        ArrayList liste = new ArrayList<String>();
        Collections.addAll(liste, values);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, liste);
        gv.setAdapter(adapter);


        Button getRestrauntButton = (Button)findViewById(R.id.getDirections);
        getRestrauntButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(RestrauntInfo.this, mapActivity.class);
                startActivity(newActivity);
            }
        });

        Button placeOrder = (Button)findViewById(R.id.placeOrder);
        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newActivity = new Intent(RestrauntInfo.this, PlaceOrder.class);
                startActivity(newActivity);
            }
        });
    }

}
