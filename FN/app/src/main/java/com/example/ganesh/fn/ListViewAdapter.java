package com.example.ganesh.fn;

import static com.example.ganesh.fn.Constants.FIRST_COLUMN;
import static com.example.ganesh.fn.Constants.SECOND_COLUMN;
import static com.example.ganesh.fn.Constants.THIRD_COLUMN;
import static com.example.ganesh.fn.Constants.FOURTH_COLUMN;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ganesh on 10/27/2016.
 */

public class ListViewAdapter extends BaseAdapter {

        public ArrayList<HashMap<String, String>> list;
        Activity activity;
        TextView txtFirst;
        TextView txtSecond;
        TextView txtThird;
        TextView txtFourth;
        public ListViewAdapter(Activity activity,ArrayList<HashMap<String, String>> list){
            super();
            this.activity=activity;
            this.list=list;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return 0;
        }



        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub



            LayoutInflater inflater=activity.getLayoutInflater();

            if(convertView == null){

                convertView=inflater.inflate(R.layout.column_row, null);

                txtFirst=(TextView) convertView.findViewById(R.id.name);
                txtSecond=(TextView) convertView.findViewById(R.id.gender);
                txtThird=(TextView) convertView.findViewById(R.id.age);
                txtFourth=(TextView) convertView.findViewById(R.id.status);

            }

            HashMap<String, String> map=list.get(position);
            txtFirst.setText(map.get(FIRST_COLUMN));
            txtSecond.setText(map.get(SECOND_COLUMN));
            txtThird.setText(map.get(THIRD_COLUMN));
            txtFourth.setText(map.get(FOURTH_COLUMN));

            return convertView;
        }
}
