package com.example.daulet.lab2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    private int result;
    private int variable;

    private TextView display;


    private static final String TAG = "LifecycleActivity";
    private TextView screen;
    private  String str1, str2, str3, result, str, sign="";
    private  double a,b;

    private enum Operations {
        ADD, SUBSTRACT, MULTIPLY, DIVIDE
    }

    private enum Stat {
        FirstOperand, Sign, Result
    }

    private Operations operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=(TextView)findViewById(R.id.textViewDisplay);
        str="";
        if (savedInstanceState != null){
            str = savedInstanceState.getString("str");
            a = savedInstanceState.getDouble("first");
            b = savedInstanceState.getDouble("second");
            sign = savedInstanceState.getString("sign");
//            Log.d("String", str);
            screen.setText(str);
        }


//        result = 0;
//        variable = 0;
//        display = (TextView) findViewById(R.id.textViewDisplay);
//        display.setText("");
    }

    public void onClick(View v){
        Button button= (Button)v;
        str+=button.getText().toString() ;
        screen.setText(str);
        if(sign == "") {
            a = Double.parseDouble(str);
            Log.e("FirstNumber", String.valueOf(a));
        }
    }

    public void onClickSigns(View v) {
        Button button = (Button) v;
        sign= button.getText().toString();
        screen.setText(sign);
        str="";
    }

    public void delete(View v){
        screen.setText("");
        str = "";
        str2= "";
        str3= "";
        sign="";
        result = "";
    }

    public void Calculate(View v){

        str2= screen.getText().toString();
        b=Double.parseDouble(str2);
        Log.e("SecondNumber = ", String.valueOf(b));
        Log.e("Sign", sign);
        if (sign.equals("+")){
            result=a+b+"";
        }
        else if (sign.equals("-")){
            result=a-b+"";
        }
        else if (sign.equals("/")){
            result=a/b+"";
        }
        else if (sign.equals("*")){
            result=a*b+"";
        }
        else {
            screen.setText("K");
        }
        screen.setText(result);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();


        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("str", screen.getText().toString());
        outState.putDouble("first", a);
        outState.putDouble("second", b);
        outState.putString("sign", sign);
        super.onSaveInstanceState(outState);
    }

    public void digitClick(View view) {
        Button btn = (Button) view;
        String digit = btn.getText().toString();
        String text;
        switch (digit) {
            case "1":
                text = display.getText().toString();
                display.setText(text + "1");
                break;
            case "2":
                text = display.getText().toString();
                display.setText(text + "2");
                break;
            case "3":
                text = display.getText().toString();
                display.setText(text + "3");
                break;
            case "4":
                text = display.getText().toString();
                display.setText(text + "4");
                break;
            case "5":
                text = display.getText().toString();
                display.setText(text + "5");
                break;
            case "6":
                text = display.getText().toString();
                display.setText(text + "6");
                break;
            case "7":
                text = display.getText().toString();
                display.setText(text + "7");
                break;
            case "8":
                text = display.getText().toString();
                display.setText(text + "8");
                break;
            case "9":
                text = display.getText().toString();
                display.setText(text + "9");
                break;
        }
    }
}
