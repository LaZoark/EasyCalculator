package com.example.easycalculator_hand_on;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    RadioButton radioBut1, radioBut2;
    RadioGroup radioGroup;
    TextView mainText, mode1Ans, mode2Ans;
    NumberPicker b1, b2;

    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton:
                if (checked) {
                    mode1Ans = (TextView) findViewById(R.id.textView3);
                    b1 = (NumberPicker) findViewById(R.id.editView);
                    b2 = (NumberPicker) findViewById(R.id.editView2);
                    switch (view.getId()) {
                        case R.id.radioButton_up:
                            if (checked)
                                mode1Ans.setText(b1.getValue() + b2.getValue());
                            break;
                        case R.id.radioButton_down:
                            if (checked)
                                mode1Ans.setText(b1.getValue() - b2.getValue());
                            break;
                    }
                }
                break;
            case R.id.radioButton2:
                if (checked)

                    break;
        }
    }
}