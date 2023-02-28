package com.mudit.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Calculator calculator;
    TextView operationsView;
    TextView resultsView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();
        operationsView = findViewById(R.id.operationView);
        resultsView = findViewById(R.id.resultView);
    }

    public void numberClicked(View view) {
        switch (view.getId()) {
            case R.id.b_zero:
                calculator.processNumber(0);
                break;
            case R.id.b_one:
                calculator.processNumber(1);
                break;
            case R.id.b_two:
                calculator.processNumber(2);
                break;
            case R.id.b_three:
                calculator.processNumber(3);
                break;
            case R.id.b_four:
                calculator.processNumber(4);
                break;
            case R.id.b_five:
                calculator.processNumber(5);
                break;
            case R.id.b_six:
                calculator.processNumber(6);
                break;
            case R.id.b_seven:
                calculator.processNumber(7);
                break;
            case R.id.b_eight:
                calculator.processNumber(8);
                break;
            case R.id.b_nine:
                calculator.processNumber(9);
        }

        updateUi();
    }

    public void onAdd(View view) {
        calculator.processOperation("+");
        updateUi();
    }

    public void onSubtract(View view) {
        calculator.processOperation("-");
        updateUi();
    }

    public void onMultiply(View view) {
        calculator.processOperation("x");
        updateUi();
    }

    public void onDivide(View view) {
        calculator.processOperation("/");
        updateUi();
    }

    public void memPlusClicked(View view) {
        calculator.memPlusClicked();
        updateUi();
    }

    public void memoryRecallClicked(View view) {
        calculator.memoryRecall();
        updateUi();
    }

    public void memoryClearClicked(View view) {
        calculator.memoryClear();
        updateUi();
    }

    public void memoryMinusClicked(View view) {
        calculator.memMinusClicked();
        updateUi();
    }

    public void clearClicked(View view) {
        calculator.clear();
        updateUi();
    }

    public void equals(View view) {
        calculator.showResult();
        updateUi();
    }

    private void updateUi() {
        resultsView.setText(calculator.resultString);
        operationsView.setText(calculator.operationString);
    }
}