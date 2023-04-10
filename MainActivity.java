package com.example.a230410widget_button_textbox;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv1, btnDiv2;
    TextView textResult;
    String num1, num2;
    Double result;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.ButAdd);
        btnSub = (Button) findViewById(R.id.ButSub);
        btnMul = (Button) findViewById(R.id.ButMul);
        btnDiv1 = (Button) findViewById(R.id.ButDiv1);
        btnDiv2 = (Button) findViewById(R.id.ButDiv2);
        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnDiv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(num2.trim().equals("0"))
                    {
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        result = Double.parseDouble(num1) / Double.parseDouble(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }

            }
        });
        btnDiv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (num2.trim().equals("0")) {
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                    } else {
                        result = Double.parseDouble(num1) % Double.parseDouble(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }
            }
        });
    }
}