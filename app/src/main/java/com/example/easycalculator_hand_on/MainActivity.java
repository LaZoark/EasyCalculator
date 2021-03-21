package com.example.easycalculator_hand_on;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements RadioGroup.OnCheckedChangeListener, TextWatcher {
    RadioGroup chooseMode;
    RadioGroup selectOperand;
    EditText b1, b2;
    TextView test, Ans;
    RadioButton operand1,operand2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = (TextView) findViewById(R.id.textView6);
        chooseMode = (RadioGroup) findViewById(R.id.radioGroup1);
        chooseMode.setOnCheckedChangeListener(this);
        selectOperand = (RadioGroup) findViewById(R.id.radioGroup2);
        selectOperand.setOnCheckedChangeListener(this);
        b1 = (EditText) findViewById(R.id.argv1);
        b2 = (EditText) findViewById(R.id.argv2);
        b1.addTextChangedListener(this);
        b2.addTextChangedListener(this);
        Ans = (TextView) findViewById(R.id.Ans);
        operand1 = (RadioButton) findViewById(R.id.radioButton_up);
        operand2 = (RadioButton) findViewById(R.id.radioButton_down);

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
    @Override
    public void afterTextChanged(Editable s) {
        test.setText("CHANGE");
//        if(chooseMode.getCheckedRadioButtonId() == R.id.plusMinus) {
//            test.setText("+");
//            Ans.setText(Float.toString(Float.valueOf(b1.getText().toString()) + Float.valueOf(b2.getText().toString())));
//        }else if(chooseMode.getCheckedRadioButtonId() == R.id.multiplyDivide){
//
//            test.setText("×");
//            Ans.setText(Float.toString(Float.valueOf(b1.getText().toString()) * Float.valueOf(b2.getText().toString())));
//        }
//        if(chooseMode.getCheckedRadioButtonId() == R.id.plusMinus) {
//            test.setText("-");
//            Ans.setText(Float.toString(Float.valueOf(b1.getText().toString()) - Float.valueOf(b2.getText().toString())));
//        }else if(chooseMode.getCheckedRadioButtonId() == R.id.multiplyDivide) {
//            test.setText("÷");
//            try {
//                Ans.setText(Float.toString(Float.valueOf(b1.getText().toString()) / Float.valueOf(b2.getText().toString())));
//            }
//            catch (Exception e){
//                test.setText((CharSequence) e);
//            }
//        }
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (group.getCheckedRadioButtonId()) {
            case R.id.plusMinus:
                test.setText("plus minus");
                operand1.setText("+");
                operand2.setText("–");
                operand1.setClickable(true);
                operand2.setClickable(true);
                break;
            case R.id.multiplyDivide:
                test.setText("multiply divide");
                operand1.setText("×");
                operand2.setText("÷");
                operand1.setClickable(true);
                operand2.setClickable(true);
                break;
            case R.id.radioButton_up:
                if(chooseMode.getCheckedRadioButtonId() == R.id.plusMinus) {
                    test.setText("+");
                    Ans.setText(Float.toString(Float.valueOf(b1.getText().toString()) + Float.valueOf(b2.getText().toString())));
                }else if(chooseMode.getCheckedRadioButtonId() == R.id.multiplyDivide){

                    test.setText("×");
                    Ans.setText(Float.toString(Float.valueOf(b1.getText().toString()) * Float.valueOf(b2.getText().toString())));
                }
                break;
            case R.id.radioButton_down:
                if(chooseMode.getCheckedRadioButtonId() == R.id.plusMinus) {
                    test.setText("-");
                    Ans.setText(Float.toString(Float.valueOf(b1.getText().toString()) - Float.valueOf(b2.getText().toString())));
                }else if(chooseMode.getCheckedRadioButtonId() == R.id.multiplyDivide) {
                    test.setText("÷");
                    try {
                        Ans.setText(Float.toString(Float.valueOf(b1.getText().toString()) / Float.valueOf(b2.getText().toString())));
                    }
                    catch (Exception e){
                        test.setText((CharSequence) e);
                    }
                }
                break;
        }
    }

}