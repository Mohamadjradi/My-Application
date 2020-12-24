package com.example.mymidterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {
private ImageView imageView1;
private TextView textView2;
private Button button;
private RadioButton radioButton;
private TextView textView4;
private RadioGroup rg;
private TextView textView;
private RadioButton rb;
private RadioButton rb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView imageView1 = findViewById(R.id.imageView1);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView2 = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button);
        RadioButton rb = findViewById(R.id.cash1);
        RadioButton cb1= findViewById(R.id.card1);
        RadioGroup rg = findViewById(R.id.rg1);
        TextView textView4 = findViewById(R.id.textView4);

        int position = getIntent().getIntExtra("position",0);
        textView2.setText("You Selected:\n"+pizza.size [position]+"  "+pizza.Price [position] +"LL"+"  "+pizza.type[position]+"  "+"pizza");
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        RadioButton bb = findViewById(rg.getCheckedRadioButtonId());
        String str = "you will pay" + pizza.Price[position]+"LL"+"  "+"using cash";
        String str1 = "you will pay"+ pizza.Price[position]+"LL"+"  "+"using card";
 if (rb.isChecked())
     Toast.makeText(OrderActivity.this,str,Toast.LENGTH_LONG).show();
else if(cb1.isChecked())
     Toast.makeText(OrderActivity.this,str1,Toast.LENGTH_LONG).show();
 else
Toast.makeText(OrderActivity.this,"please fill all the order",Toast.LENGTH_LONG).show();
    }
});
    }

}