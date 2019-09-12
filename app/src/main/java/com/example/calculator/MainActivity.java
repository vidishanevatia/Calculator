package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button  plus, minus, divide, multi,clearr;
     EditText number1, number2;
     TextView tv,answer;
    double value1,value2,ans;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        divide=findViewById(R.id.divide);
        multi=findViewById(R.id.multi);
        number1=findViewById(R.id.number1);
        number2=findViewById(R.id.number2);
        tv=findViewById(R.id.tv);
        answer=findViewById(R.id.answer);
        clearr= findViewById(R.id.clearr);

        //Addition
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* value1 = Double.parseDouble(number1.getText().toString());
                value2 = Double.parseDouble(number2.getText().toString());
                ans = value1 + value2;
                answer.setText(Double.toString(ans));*/
               onClic(view);
            }
        });

        //Subtraction
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*value1 = Double.parseDouble(number1.getText().toString());
                value2 = Double.parseDouble(number2.getText().toString());
                ans = value1 - value2;
                answer.setText(Double.toString(ans));*/
                onClic(view);
            }
        });

        // Multiplication
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*value1 = Double.parseDouble(number1.getText().toString());
                value2 = Double.parseDouble(number2.getText().toString());
                ans = value1 * value2;
                answer.setText(Double.toString(ans));*/
                onClic(view);

            }
        });

        //Division
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* value1 = Double.parseDouble(number1.getText().toString());
                value2 = Double.parseDouble(number2.getText().toString());
                ans = value1 / value2;
                answer.setText(Double.toString(ans));*/
               onClic(view);
            }


        });

        clearr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClic(view);
            }
        });




    }

    public void onClic(View v)
    {
        if(number1.getText().length()>0 && number2.getText().length()>0)
        {
            value1 = Double.parseDouble(number1.getText().toString());
            value2 = Double.parseDouble(number2.getText().toString());
            switch (v.getId())
            {
                case R.id.plus: ans = value1 + value2;break;
                case R.id.minus: ans = value1 - value2;break;
                case R.id.divide: ans = value1 / value2;break;
                case R.id.multi: ans = value1 * value2;break;
                case R.id.clearr: number1.setText("");
                                    number2.setText("");
                                    answer.setText("");
                                    break;
            }
            if(v.getId()!=R.id.clearr)
                answer.setText(Double.toString(ans));
        }
        else {
            Toast toast = Toast.makeText(MainActivity.this, "Enter The Required Numbers", Toast.LENGTH_LONG);
            toast.show();

        }



    }

    public void onClickk(View v)
    {
        value1 = Double.parseDouble(number1.getText().toString());
        value2 = Double.parseDouble(number2.getText().toString());

        if(v.getId()==R.id.plus)
            ans = value1 + value2;
        else if (v.getId()==R.id.minus)
            ans = value1 - value2;
        else if (v.getId() == R.id.multi)
            ans = value1 * value2;
        else
            ans = value1 / value2;

        answer.setText(Double.toString(ans));
    }



}


