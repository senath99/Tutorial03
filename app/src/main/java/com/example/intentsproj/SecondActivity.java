package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView num1,num2,answer;
    private int result;
    private int no1,no2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
        toast.show();

        num1 = findViewById(R.id.txt3);
        num2  = findViewById(R.id.txt4);

       no1 = getIntent().getIntExtra("No1",0);
        no2 = getIntent().getIntExtra("No2",0);

        num1.setText(String.valueOf(no1));
        num2.setText(String.valueOf(no2));




    }

    public void buttonOnClick(View view)
    {
        switch(view.getId())
        {
            case R.id.add:
                result = no1 + no2;
                break;

            case R.id.sub:

                  result = no1 - no2;

                break;
            case R.id.div:
                result = no1 / no2;


                break;

            case R.id.Mul:
                result = no1 * no2;

                break;



            default:
                // Code for button 3 click
                break;
        }


        answer = findViewById(R.id.txt5);
        answer.setText(String.valueOf(result));
    }
}