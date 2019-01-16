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
    int selectedButton;
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
        spinner.setPrompt("Select button to change");

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (editTextItemName.getText().toString() == "") {
                    Toast.makeText(getApplicationContext(), "Please enter a valid item name", Toast.LENGTH_SHORT).show();

                } else if (editTextPrice.getText().toString() == "") {
                    Toast.makeText(getApplicationContext(), "Please enter a valid item price (decimal)", Toast.LENGTH_SHORT).show();

                } else if (1==2){
                    Toast.makeText(getApplicationContext(), "Please select a button", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Made it to else", Toast.LENGTH_SHORT).show();
                    MainActivity.prices.set(spinner.getSelectedItemPosition(), Double.parseDouble(editTextPrice.getText().toString()));
                    MainActivity.buttonLabels.set(selectedButton - 1, editTextItemName.getText().toString());
                }
                }
            });
        }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item

        switch (spinner.getSelectedItemPosition() + 1) {
            case 1:
                selectedButton = 1;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(0));
                textViewCurrentPrice.setText(MainActivity.prices.get(0).toString());
                break;
            case 2:
                selectedButton = 2;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(1));
                textViewCurrentPrice.setText(MainActivity.prices.get(1).toString());
                break;
            case 3:
                selectedButton = 3;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(2));
                textViewCurrentPrice.setText(MainActivity.prices.get(2).toString());
                break;
            case 4:
                selectedButton = 4;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(3));
                textViewCurrentPrice.setText(MainActivity.prices.get(3).toString());
                break;
            case 5:
                selectedButton = 5;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(4));
                textViewCurrentPrice.setText(MainActivity.prices.get(4).toString());
                break;
            case 6:
                selectedButton = 6;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(5));
                textViewCurrentPrice.setText(MainActivity.prices.get(5).toString());
                break;
            case 7:
                selectedButton = 7;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(6));
                textViewCurrentPrice.setText(MainActivity.prices.get(6).toString());
                break;
            case 8:
                selectedButton = 8;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(7));
                textViewCurrentPrice.setText(MainActivity.prices.get(7).toString());
                break;
            case 9:
                selectedButton = 9;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(8));
                textViewCurrentPrice.setText(MainActivity.prices.get(8).toString());
                break;
            case 10:
                selectedButton = 10;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(9));
                textViewCurrentPrice.setText(MainActivity.prices.get(9).toString());
                break;
            case 11:
                selectedButton = 11;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(10));
                textViewCurrentPrice.setText(MainActivity.prices.get(10).toString());
                break;
            case 12:
                selectedButton = 12;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(11));
                textViewCurrentPrice.setText(MainActivity.prices.get(11).toString());
                break;
            case 13:
                selectedButton = 13;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(12));
                textViewCurrentPrice.setText(MainActivity.prices.get(12).toString());
                break;
            case 14:
                selectedButton = 14;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(13));
                textViewCurrentPrice.setText(MainActivity.prices.get(13).toString());
                break;
            case 15:
                selectedButton = 15;
                textViewCurrentItem.setText(MainActivity.buttonLabels.get(14));
                textViewCurrentPrice.setText(MainActivity.prices.get(14).toString());
                break;
        }
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}

