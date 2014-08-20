package com.example.siwaweswongcharoen.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindWidget();
    }

    private void bindWidget() {
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_reset) {
            tvDisplay.setText("");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void buttonClicked(View view) {
        switch (view.getId()) {
            case R.id.button0:
                tvDisplay.setText(tvDisplay.getText().toString() + "0");
                break;
            case R.id.button1:
                tvDisplay.setText(tvDisplay.getText().toString() + "1");
                break;
            case R.id.button2:
                tvDisplay.setText(tvDisplay.getText().toString() + "2");
                break;
            case R.id.button3:
                tvDisplay.setText(tvDisplay.getText().toString() + "3");
                break;
            case R.id.button4:
                tvDisplay.setText(tvDisplay.getText().toString() + "4");
                break;
            case R.id.button5:
                tvDisplay.setText(tvDisplay.getText().toString() + "5");
                break;
            case R.id.button6:
                tvDisplay.setText(tvDisplay.getText().toString() + "6");
                break;
            case R.id.button7:
                tvDisplay.setText(tvDisplay.getText().toString() + "7");
                break;
            case R.id.button8:
                tvDisplay.setText(tvDisplay.getText().toString() + "8");
                break;
            case R.id.button9:
                tvDisplay.setText(tvDisplay.getText().toString() + "9");
                break;
            case R.id.buttonPlus:
                tvDisplay.setText(tvDisplay.getText().toString() + "+");
                break;
            case R.id.buttonResult:
                int sum = 0;
                String[] parts = tvDisplay.getText().toString().split("\\+");
                for (String part : parts) {
                    sum += Integer.parseInt(part);
                }
                tvDisplay.setText(Integer.toString(sum));
                break;
        }
    }
}
