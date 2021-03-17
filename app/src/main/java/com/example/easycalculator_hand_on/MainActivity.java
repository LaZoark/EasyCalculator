package com.example.easycalculator_hand_on;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
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
        b1.addTextChangedListener(this);
        b2 = (EditText) findViewById(R.id.argv2);
        b2.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
    @Override
    public void afterTextChanged(Editable s) {
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        RadioGroup method = (RadioGroup) group;
        Ans = (TextView) findViewById(R.id.textView3);
        switch (method.getCheckedRadioButtonId()) {
            case R.id.plusMinus:
                switch (method.getCheckedRadioButtonId()) {
                    case R.id.radioButton_up:
                        Ans.setText(Integer.parseInt(b1.getText().toString()) + Integer.parseInt(b2.getText().toString()));
                        break;
                    case R.id.radioButton_down:
                        Ans.setText(Integer.parseInt(b1.getText().toString()) - Integer.parseInt(b2.getText().toString()));
                        break;
                }break;
            case R.id.multiplyDivide:
                switch (method.getCheckedRadioButtonId()) {
                    case R.id.radioButton_up:
                        Ans.setText(Integer.parseInt(b1.getText().toString()) * Integer.parseInt(b2.getText().toString()));
                        break;
                    case R.id.radioButton_down:
                        Ans.setText(Integer.parseInt(b1.getText().toString()) / Integer.parseInt(b2.getText().toString()));
                        break;
                }break;
        }
    }

}