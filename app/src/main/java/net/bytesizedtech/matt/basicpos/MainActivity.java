package net.bytesizedtech.matt.basicpos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView display;
    TextView displayChange;
    EditText amountPaid;
    Double runningTotal;
    public static ArrayList<Double> prices = new ArrayList<Double>(15){
        {
            for (int i = 0; i < 15; i++) {
                add(0.0);
            }
        }
    };
    public static ArrayList<String> buttonLabels = new ArrayList<String>(15) {
        {
            for (int i = 0; i < 15; i++) {
                add("");
            }
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
        displayChange = findViewById(R.id.displayChange);
        amountPaid = findViewById(R.id.amountPaid);
        amountPaid.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    switch (keyCode)
                    {
                        case KeyEvent.KEYCODE_DPAD_CENTER:
                        case KeyEvent.KEYCODE_ENTER:
                            calcChange();
                            return true;
                        default:
                            break;
                    }
                }
                return false;
            }
        });

        ArrayList<Button> buttons = new ArrayList<Button>() {
            {
                Button button1;
                Button button2;
                Button button3;
                Button button4;
                Button button5;
                Button button6;
                Button button7;
                Button button8;
                Button button9;
                Button button10;
                Button button11;
                Button button12;
                Button button13;
                Button button14;
                Button button15;
                button1 = findViewById(R.id.button1);
                button1.setText(buttonLabels.get(0));
                button2 = findViewById(R.id.button2);
                button2.setText(buttonLabels.get(1));
                button3 = findViewById(R.id.button3);
                button3.setText(buttonLabels.get(2));
                button4 = findViewById(R.id.button4);
                button4.setText(buttonLabels.get(3));
                button5 = findViewById(R.id.button5);
                button5.setText(buttonLabels.get(4));
                button6 = findViewById(R.id.button6);
                button6.setText(buttonLabels.get(5));
                button7 = findViewById(R.id.button7);
                button7.setText(buttonLabels.get(6));
                button8 = findViewById(R.id.button8);
                button8.setText(buttonLabels.get(7));
                button9 = findViewById(R.id.button9);
                button9.setText(buttonLabels.get(8));
                button10 = findViewById(R.id.button10);
                button10.setText(buttonLabels.get(9));
                button11 = findViewById(R.id.button11);
                button11.setText(buttonLabels.get(10));
                button12 = findViewById(R.id.button12);
                button12.setText(buttonLabels.get(11));
                button13 = findViewById(R.id.button13);
                button13.setText(buttonLabels.get(12));
                button14 = findViewById(R.id.button14);
                button14.setText(buttonLabels.get(13));
                button15 = findViewById(R.id.button15);
                button15.setText(buttonLabels.get(14));

            }
        };
        for (Button button : buttons) {
            button.setOnClickListener(this);
        }
        Button buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(this);
        Button buttonEditItems = findViewById(R.id.buttonEditItems);
        buttonEditItems.setOnClickListener(this);
        display.setText("$0.0");
        displayChange.setText("$0.0");
        runningTotal = 0.0;


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button1:
                runningTotal = runningTotal + prices.get(0);
                updateDisplay();
                break;

            case R.id.button2:
                runningTotal = runningTotal + prices.get(1);
                updateDisplay();
                break;

            case R.id.button3:
                runningTotal = runningTotal + prices.get(2);
                updateDisplay();
                break;

            case R.id.button4:
                runningTotal = runningTotal + prices.get(3);
                updateDisplay();
                break;

            case R.id.button5:
                runningTotal = runningTotal + prices.get(4);
                updateDisplay();
                break;

            case R.id.button6:
                runningTotal = runningTotal + prices.get(5);
                updateDisplay();
                break;

            case R.id.button7:
                runningTotal = runningTotal + prices.get(6);
                updateDisplay();
                break;

            case R.id.button8:
                runningTotal = runningTotal + prices.get(7);
                updateDisplay();
                break;

            case R.id.button9:
                runningTotal = runningTotal + prices.get(8);
                updateDisplay();
                break;

            case R.id.button10:
                runningTotal = runningTotal + prices.get(9);
                updateDisplay();
                break;

            case R.id.button11:
                runningTotal = runningTotal + prices.get(10);
                updateDisplay();
                break;

            case R.id.button12:
                runningTotal = runningTotal + prices.get(11);
                updateDisplay();
                break;

            case R.id.button13:
                runningTotal = runningTotal + prices.get(12);
                updateDisplay();
                break;

            case R.id.button14:
                runningTotal = runningTotal + prices.get(13);
                updateDisplay();
                break;

            case R.id.button15:
                runningTotal = runningTotal + prices.get(14);
                updateDisplay();
                break;

            case R.id.buttonClear:
                runningTotal = 0.0;
                displayChange.setText("$0.0");
                amountPaid.setText("");
                updateDisplay();
                break;
            case R.id.buttonEditItems:
                Intent intent = new Intent(this, ItemSetting.class);
                startActivity(intent);
                break;

        }
    }
    private void updateDisplay() {
        display.setText("$" + String.format(Double.toString((double)Math.round(runningTotal * 100d) / 100d
                )));
    }
    private void calcChange() {
        displayChange.setText("$" + Double.toString((double)Math.round((Double.parseDouble(amountPaid.getText().toString()) - runningTotal) * 100d) / 100d));
    }
}
