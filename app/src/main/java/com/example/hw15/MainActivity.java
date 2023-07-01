package com.example.hw15;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private Integer first, second;

    private Boolean isOperationClick;

    private String action;

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.next_button);
        findViewById(R.id.next_button).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            String text = textView.getText().toString();
            intent.putExtra("policies", text);
            startActivity(intent);
        });
    }


   @SuppressLint("NonConstantResourceId")
    public void onNumberClick(View view) {
        if (view.getId() == R.id.btn_one){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("1");
                button.setVisibility(View.GONE);
            }
            else {
                textView.append("1");
                button.setVisibility(View.GONE);
            }
        }
        else if(view.getId() == R.id.btn_two){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("2");
                button.setVisibility(View.GONE);
            }
            else {
                textView.append("2");
                button.setVisibility(View.GONE);
            }
        }
        else if(view.getId() == R.id.btn_three){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("3");
                button.setVisibility(View.GONE);
            }
            else {
                textView.append("3");
                button.setVisibility(View.GONE);
            }
        }
        else if(view.getId() == R.id.btn_four){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("4");
                button.setVisibility(View.GONE);
            }
            else {
                textView.append("4");
                button.setVisibility(View.GONE);
            }
        }
        else if(view.getId() == R.id.btn_five){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("5");
                button.setVisibility(View.GONE);
            }
            else {
                textView.append("5");
                button.setVisibility(View.GONE);
            }
        }
        else if(view.getId() == R.id.btn_six){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("6");
                button.setVisibility(View.GONE);
            }
            else {
                textView.append("6");
                button.setVisibility(View.GONE);
            }
        }
        else if(view.getId() == R.id.btn_seven){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("7");
                button.setVisibility(View.GONE);
            }
            else {
                textView.append("7");
                button.setVisibility(View.GONE);
            }
        }
        else if(view.getId() == R.id.btn_eight){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("8");
                button.setVisibility(View.GONE);
            }
            else {
                textView.append("8");
                button.setVisibility(View.GONE);
            }
        }
        else if(view.getId() == R.id.btn_nine){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("9");
                button.setVisibility(View.GONE);
            }
            else {
                textView.append("9");
                button.setVisibility(View.GONE);
            }
        }
        else if(view.getId() == R.id.btn_zero){
            if (textView.getText().toString().equals("0") || isOperationClick){
                textView.setText("0");
                button.setVisibility(View.GONE);
            }
            else {
                textView.append("0");
                button.setVisibility(View.GONE);
            }
        }
        else if(view.getId() == R.id.btn_clear){
            first = 0;
            second = 0;
            textView.setText("0");
            button.setVisibility(View.GONE);
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        if(view.getId() == R.id.btn_plus){
            first = Integer.valueOf(textView.getText().toString());
            action = "plus";
            button.setVisibility(View.GONE);
        }
        else if(view.getId() == R.id.btn_minus){
            first = Integer.valueOf(textView.getText().toString());
            action = "minus";
            button.setVisibility(View.GONE);
        }
        else if(view.getId() == R.id.btn_multiply){
            first = Integer.valueOf(textView.getText().toString());
            action = "multiply";
            button.setVisibility(View.GONE);
        }
        else if(view.getId() == R.id.btn_divide){
            first = Integer.valueOf(textView.getText().toString());
            action = "divide";
            button.setVisibility(View.GONE);
        }
        else if(view.getId() == R.id.btn_percent){
            button.setVisibility(View.GONE);
        }
        else if(view.getId() == R.id.button_plus_minus){
            button.setVisibility(View.GONE);
        }
        else if(view.getId() == R.id.button_dot){
            button.setVisibility(View.GONE);
        }
        else if(view.getId() == R.id.btn_equal && Objects.equals(action, "plus")){
            second = Integer.valueOf(textView.getText().toString());
            Integer sum = first + second;
            textView.setText(sum.toString());
            button.setVisibility(View.VISIBLE);
        }
        else if(view.getId() == R.id.btn_equal && Objects.equals(action, "minus")){
            second = Integer.valueOf(textView.getText().toString());
            Integer sum = first - second;
            textView.setText(sum.toString());
            button.setVisibility(View.VISIBLE);
        }
        else if(view.getId() == R.id.btn_equal && Objects.equals(action, "multiply")){
            second = Integer.valueOf(textView.getText().toString());
            Integer sum = first * second;
            textView.setText(sum.toString());
            button.setVisibility(View.VISIBLE);
        }
        else if(view.getId() == R.id.btn_equal && Objects.equals(action, "divide")){
            second = Integer.valueOf(textView.getText().toString());
            try {
                Integer sum = first / second;
                textView.setText(sum.toString());
                button.setVisibility(View.VISIBLE);
            }
            catch (ArithmeticException e){
                Toast.makeText(getApplicationContext(),"Нельзя делить на 0",Toast.LENGTH_SHORT).show();
            }

        }
        isOperationClick = true;
    }


}