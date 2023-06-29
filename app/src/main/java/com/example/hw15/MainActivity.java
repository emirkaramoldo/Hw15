package com.example.hw15;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private Integer first, second;

    private Boolean isOperationClick;

    private String action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

   @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        if (view.getId() == R.id.btn_one){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("1");
            }
            else {
                textView.append("1");
            }
        }
        else if(view.getId() == R.id.btn_two){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("2");
            }
            else {
                textView.append("2");
            }
        }
        else if(view.getId() == R.id.btn_three){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("3");
            }
            else {
                textView.append("3");
            }
        }
        else if(view.getId() == R.id.btn_four){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("4");
            }
            else {
                textView.append("4");
            }
        }
        else if(view.getId() == R.id.btn_five){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("5");
            }
            else {
                textView.append("5");
            }
        }
        else if(view.getId() == R.id.btn_six){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("6");
            }
            else {
                textView.append("6");
            }
        }
        else if(view.getId() == R.id.btn_seven){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("7");
            }
            else {
                textView.append("7");
            }
        }
        else if(view.getId() == R.id.btn_eight){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("8");
            }
            else {
                textView.append("8");
            }
        }
        else if(view.getId() == R.id.btn_nine){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("9");
            }
            else {
                textView.append("9");
            }
        }
        else if(view.getId() == R.id.btn_zero){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("0");
            }
            else {
                textView.append("0");
            }
        }
        else if(view.getId() == R.id.btn_clear){
            first = 0;
            second = 0;
            textView.setText("0");
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        if(view.getId() == R.id.btn_plus){
            first = Integer.valueOf(textView.getText().toString());
            action = "plus";
        }
        else if(view.getId() == R.id.btn_minus){
            first = Integer.valueOf(textView.getText().toString());
            action = "minus";
        }
        else if(view.getId() == R.id.btn_multiply){
            first = Integer.valueOf(textView.getText().toString());
            action = "multiply";
        }
        else if(view.getId() == R.id.btn_divide){
            first = Integer.valueOf(textView.getText().toString());
            action = "divide";
        }
        else if(view.getId() == R.id.btn_equal && Objects.equals(action, "plus")){
            second = Integer.valueOf(textView.getText().toString());
            Integer sum = first + second;
            textView.setText(sum.toString());
        }
        else if(view.getId() == R.id.btn_equal && Objects.equals(action, "minus")){
            second = Integer.valueOf(textView.getText().toString());
            Integer sum = first - second;
            textView.setText(sum.toString());
        }
        else if(view.getId() == R.id.btn_equal && Objects.equals(action, "multiply")){
            second = Integer.valueOf(textView.getText().toString());
            Integer sum = first * second;
            textView.setText(sum.toString());
        }
        else if(view.getId() == R.id.btn_equal && Objects.equals(action, "divide")){
            second = Integer.valueOf(textView.getText().toString());
            try {
                Integer sum = first / second;
                textView.setText(sum.toString());
            }
            catch (ArithmeticException e){
                Toast.makeText(getApplicationContext(),"Нельзя делить на 0",Toast.LENGTH_SHORT).show();
            }

        }
        isOperationClick = true;
    }
}