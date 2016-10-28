package com.example.ganesh.fn;

import static com.example.ganesh.fn.Constants.FIRST_COLUMN;
import static com.example.ganesh.fn.Constants.SECOND_COLUMN;
import static com.example.ganesh.fn.Constants.THIRD_COLUMN;
import static com.example.ganesh.fn.Constants.FOURTH_COLUMN;

import com.example.ganesh.fn.ListViewAdapter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //GridView list = (GridView) findViewById(R.id.gridView);
        //String[] values = new String[] {"Food","Quantity","Price","Delivery","Sushi","5","$2.66","N","Sandwich","5","$1.5","N"};
        //ArrayList liste = new ArrayList<String>();
        //Collections.addAll(liste, values);
        //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, liste);
        //list.setAdapter(adapter);

        ListView listView=(ListView)findViewById(R.id.listView1);

        ArrayList list=new ArrayList<HashMap<String,String>>();

        HashMap<String,String> temp=new HashMap<String, String>();
        temp.put(FIRST_COLUMN, "Ankit Karia");
        temp.put(SECOND_COLUMN, "Male");
        temp.put(THIRD_COLUMN, "22");
        temp.put(FOURTH_COLUMN, "Unmarried");
        list.add(temp);

        HashMap<String,String> temp2=new HashMap<String, String>();
        temp2.put(FIRST_COLUMN, "Rajat Ghai");
        temp2.put(SECOND_COLUMN, "Male");
        temp2.put(THIRD_COLUMN, "25");
        temp2.put(FOURTH_COLUMN, "Unmarried");
        list.add(temp2);

        HashMap<String,String> temp3=new HashMap<String, String>();
        temp3.put(FIRST_COLUMN, "Karina Kaif");
        temp3.put(SECOND_COLUMN, "Female");
        temp3.put(THIRD_COLUMN, "31");
        temp3.put(FOURTH_COLUMN, "Unmarried");
        list.add(temp3);
        System.out.println(list);
        ListViewAdapter adapter=new ListViewAdapter(this, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id)
            {
                int pos=position+1;
                Toast.makeText(Main2Activity.this, Integer.toString(pos)+" Clicked", Toast.LENGTH_SHORT).show();
            }

        });

    }

}
