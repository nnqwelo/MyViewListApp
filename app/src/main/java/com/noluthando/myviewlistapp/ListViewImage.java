package com.noluthando.myviewlistapp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class ListViewImage extends AppCompatActivity {
    ListView listView;
    Context context;

    public static int[] proImages ={
            R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven,
            R.drawable.eight, R.drawable.nine
    };

    public static String [] proNames ={
            "Power","Play","Pause","Rewind","Forward","Stop","Back","Next","Record"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image);

        ListViewAdapter adapter = new ListViewAdapter(this, proNames, proImages);
        listView = (ListView) findViewById(R.id.listView2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick( AdapterView parent, View view, int position, long id){
                Toast.makeText(ListViewImage.this, "U clicked on:" + proNames[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

}

