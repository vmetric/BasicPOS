package net.bytesizedtech.matt.basicpos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = findViewById(R.id.button1);
        button2.setOnClickListener(this);
        Button button3 = findViewById(R.id.button1);
        button3.setOnClickListener(this);
        Button button4 = findViewById(R.id.button1);
        button4.setOnClickListener(this);
        Button button5 = findViewById(R.id.button1);
        button5.setOnClickListener(this);
        Button button6 = findViewById(R.id.button1);
        button6.setOnClickListener(this);
        Button button7 = findViewById(R.id.button1);
        button7.setOnClickListener(this);
        Button button8 = findViewById(R.id.button1);
        button8.setOnClickListener(this);
        Button button9 = findViewById(R.id.button1);
        button9.setOnClickListener(this);
        Button button10 = findViewById(R.id.button1);
        button10.setOnClickListener(this);
        Button button11 = findViewById(R.id.button1);
        button11.setOnClickListener(this);
        Button button12 = findViewById(R.id.button1);
        button12.setOnClickListener(this);
        Button button13 = findViewById(R.id.button1);
        button13.setOnClickListener(this);
        Button button14 = findViewById(R.id.button1);
        button14.setOnClickListener(this);
        Button button15 = findViewById(R.id.button1);
        button15.setOnClickListener(this);

        ArrayList<Double> prices = new ArrayList<Double>(15){
            {
            add(1.21);
            add(2.20);
            add(3.10);
            add(2.75);
            add(8.75);
            add(5.00);
            add(1.00);
            add(3.00);
            add(2.21);
            add(3.32);
            add(5.75);
            add(15.00);
            add(25.00);
            add(12.42);
            add(9.12);
            }
        };


    }
    @Override
    public void onClick(View v) {

    }
}
