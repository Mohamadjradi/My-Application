package com.example.mymidterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListPizza extends AppCompatActivity {
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView = findViewById(R.id.listView);
        String [] sizeprice={
                pizza.size[0]+" "+pizza.Price[0]+"LL",
                pizza.size[1]+" "+pizza.Price[1]+"LL",
                pizza.size[2]+" "+pizza.Price[2]+"LL",

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,sizeprice){



        };
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListPizza.this, OrderActivity.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }
}