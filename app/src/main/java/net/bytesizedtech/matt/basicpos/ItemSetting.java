package net.bytesizedtech.matt.basicpos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ItemSetting extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button selectedButton;
    Spinner spinner;
    TextView textViewCurrentItem;
    TextView textViewCurrentPrice;
    Button buttonUpdate;
    EditText editTextItemName;
    EditText editTextPrice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_setting);

        buttonUpdate = findViewById(R.id.buttonUpdate);
        textViewCurrentItem = findViewById(R.id.textViewCurrentItem);
        textViewCurrentPrice = findViewById(R.id.textViewCurrentPrice);
        editTextItemName = findViewById(R.id.editTextItemName);
        editTextPrice = findViewById(R.id.editTextPrice);
        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        List<Integer> spinnerList = new ArrayList<Integer>();
        for (int i = 1; i <= 15; i++) {
            spinnerList.add(i);
        }
        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, spinnerList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (editTextItemName.getText().toString() == "") {
                    //Show message "please enter valid item name"
                } else if (editTextPrice.getText().toString() == "") {
                    //"Please enter valid decimal for item price"
                } else if (selectedButton == null){
                    //"Please select a button"
                } else {
                    MainActivity.prices.set(spinner.getSelectedItemPosition(), Double.parseDouble(editTextPrice.getText().toString()));
                    MainActivity.changeButtonText(MainActivity.button2, editTextItemName.getText().toString());
                }
                }
            });
        }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item

        switch (spinner.getSelectedItemPosition() + 1) {
            case 1:
                selectedButton = MainActivity.button1;
                textViewCurrentItem.setText(MainActivity.button1.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(0).toString());
                break;
            case 2:
                selectedButton = findViewById(R.id.button2);
                textViewCurrentItem.setText(MainActivity.button2.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(1).toString());
                break;
            case 3:
                selectedButton = MainActivity.button3;
                textViewCurrentItem.setText(MainActivity.button3.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(2).toString());
                break;
            case 4:
                selectedButton = MainActivity.button4;
                textViewCurrentItem.setText(MainActivity.button4.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(3).toString());
                break;
            case 5:
                selectedButton = MainActivity.button5;
                textViewCurrentItem.setText(MainActivity.button5.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(4).toString());
                break;
            case 6:
                selectedButton = MainActivity.button6;
                textViewCurrentItem.setText(MainActivity.button6.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(5).toString());
                break;
            case 7:
                selectedButton = MainActivity.button7;
                textViewCurrentItem.setText(MainActivity.button7.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(6).toString());
                break;
            case 8:
                selectedButton = MainActivity.button8;
                textViewCurrentItem.setText(MainActivity.button8.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(7).toString());
                break;
            case 9:
                selectedButton = MainActivity.button9;
                textViewCurrentItem.setText(MainActivity.button9.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(8).toString());
                break;
            case 10:
                selectedButton = MainActivity.button10;
                textViewCurrentItem.setText(MainActivity.button10.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(9).toString());
                break;
            case 11:
                selectedButton = MainActivity.button11;
                textViewCurrentItem.setText(MainActivity.button11.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(10).toString());
                break;
            case 12:
                selectedButton = MainActivity.button12;
                textViewCurrentItem.setText(MainActivity.button12.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(11).toString());
                break;
            case 13:
                selectedButton = MainActivity.button13;
                textViewCurrentItem.setText(MainActivity.button13.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(12).toString());
                break;
            case 14:
                selectedButton = MainActivity.button14;
                textViewCurrentItem.setText(MainActivity.button14.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(13).toString());
                break;
            case 15:
                selectedButton = MainActivity.button15;
                textViewCurrentItem.setText(MainActivity.button15.getText());
                textViewCurrentPrice.setText(MainActivity.prices.get(14).toString());
                break;
        }
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}

