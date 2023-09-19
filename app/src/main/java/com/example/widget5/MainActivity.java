package com.example.widget5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupMain,radioGroupOption;
    private Button buttonOk;
    private TextView textViewResult;
    private int mainFlag;
    private int optionFlag;
    private RadioButton radioButtonOption1,radioButtonOption2,radioButtonOption3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupMain = findViewById(R.id.radioGroup_main);
        radioGroupOption = findViewById(R.id.radioGroup_option);
        radioButtonOption1 = findViewById(R.id.radioButton_option1);
        radioButtonOption2 = findViewById(R.id.radioButton_option2);
        radioButtonOption3 = findViewById(R.id.radioButton_option3);

        buttonOk = findViewById(R.id.button_ok);
        textViewResult = findViewById(R.id.textView_result);
        textViewResult.setText("");
        mainFlag=1;
        optionFlag=0;
        radioGroupMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton1:
                        mainFlag = 1;
                        Log.d("main", "mainFlag= " + mainFlag);
                        radioButtonOption1.setText("Happy");
                        radioButtonOption2.setText("Yellow");
                        radioButtonOption3.setText("Big");
                        break;
                    case R.id.radioButton2:
                        mainFlag = 2;
                        Log.d("main", "mainFlag= " + mainFlag);
                        radioButtonOption1.setText("Cut");
                        radioButtonOption2.setText("White");
                        radioButtonOption3.setText("Small");
                        break;
                    case R.id.radioButton3:
                        mainFlag = 3;
                        Log.d("main", "mainFlag= " + mainFlag);
                        break;
                }
            }
        });

        radioGroupOption.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton_option1:
                        optionFlag = 1;
                        Log.d("main", "optionFlag= " + optionFlag);
                        break;
                    case R.id.radioButton_option2:
                        optionFlag = 2;
                        Log.d("main", "optionFlag= " + optionFlag);
                        break;
                    case R.id.radioButton_option3:
                        optionFlag = 3;
                        Log.d("main", "optionFlag= " + optionFlag);
                        break;
                }
            }


        });

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainFlag == 1) {
                    textViewResult.setText("You select dog 1");
                } else if (mainFlag == 2) {
                    textViewResult.setText("You select dog 2");
                } else if (mainFlag == 3) {
                    textViewResult.setText("You select dog 3");
                }

                switch (optionFlag){
                    case 1:
                        textViewResult.append("\n"+"It is " + radioButtonOption1.getText());
                        break;

                    case 2:
                        textViewResult.append("\n"+"It is " + radioButtonOption2.getText());
                        break;

                    case 3:
                        textViewResult.append("\n"+"It is " + radioButtonOption3.getText());
                        break;
                }
            }
        });
    }
}