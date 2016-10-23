package com.example.shaloin.fouthassignmenta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> months;
    private ListView listView;
    private Button asc,dsc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        months=new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.row,months);
        listView=(ListView)findViewById(R.id.listID);
        listView.setAdapter(adapter);
    }

    public void ascending(View v){
        asc=(Button)findViewById(R.id.bascndID);
       // Comparator comp= Collections.reverseOrder();
        Collections.sort(months);

    }
    public void descending(View v){
        dsc=(Button)findViewById(R.id.bdscndID);
        Collections.sort(months,Collections.<String>reverseOrder());

    }
}
