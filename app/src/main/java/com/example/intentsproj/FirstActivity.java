package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FirstActivity extends AppCompatActivity {


    Button button;
    TextView no1,no2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        button = findViewById(R.id.btn1);
        no1 = findViewById(R.id.txt1);
        no2 = findViewById(R.id.txt2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 =     Integer.parseInt(no1.getText().toString()) ;
                int num2 =    Integer.parseInt(no2.getText().toString());


                Intent i = new Intent(getApplicationContext(), SecondActivity.class);

                i.putExtra("No1",num1);
                i.putExtra("No2",num2);
                startActivity(i);



            }



        });














    }

}

//    public void onClick(View view) {
//
//
//
//        Intent i = new Intent(this,SecondActivity.class);
//        startActivity(i);
//
//
//
//    }
