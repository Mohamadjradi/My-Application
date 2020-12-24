package com.example.mymidterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
private Button bt1;
private CheckBox checkBox1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = findViewById(R.id.bt1);
        CheckBox checkBox1 = findViewById(R.id.checkBox1);




        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked()){

                Intent intent = new Intent(MainActivity.this, ListPizza.class);
                startActivity(intent);
            }}
        });

    }


    }
