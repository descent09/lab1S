package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClickSum(View v) { //функция сложения
        EditText number1 = (EditText) findViewById(R.id.number1);//EditText - класс, number1-название класса(переменной)
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView resText = (TextView) findViewById(R.id.result);//TextView - класс который позволяет брать текстовые поля

        double num1= Double.parseDouble(number1.getText().toString());//Double - класс, parseDouble-метод преобразующий в формат типа Double из строки
        double num2= Double.parseDouble(number2.getText().toString());//То что в скобках - берём текстовый элемент number(1,2), getText - берём его текстовое значение, toString - преобразует в строку
        double resSum = num1 + num2;
        resText.setText(Double.toString(resSum));
    }
    public void onButtonClickMult(View v){ //функция умножения
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView resText = (TextView) findViewById(R.id.result);

        double num1= Double.parseDouble(number1.getText().toString());
        double num2= Double.parseDouble(number2.getText().toString());
        double resMult = num1 * num2;
        resText.setText(Double.toString(resMult));
    }
    public void onButtonClickDif(View v){ //функция вычитания
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView resText = (TextView) findViewById(R.id.result);

        double num1= Double.parseDouble(number1.getText().toString());
        double num2= Double.parseDouble(number2.getText().toString());
        double resDif = num1 - num2;
        resText.setText(Double.toString(resDif));
    }
    public void onButtonClickDiv(View v){ //функция деления
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView resText = (TextView) findViewById(R.id.result);

        double num1= Double.parseDouble(number1.getText().toString());
        double num2= Double.parseDouble(number2.getText().toString());
        double resDiv = num1 / num2;
        resText.setText(Double.toString(resDiv));
    }
}