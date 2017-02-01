package com.example.toshiba.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText firstNumberN1,secondNumberN2;
    private Button buttonB1,buttonB2,buttonB3;
    private TextView resultText;

    @SuppressLint("CutPasteId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberN1=(EditText) findViewById(R.id.first);
        secondNumberN2=(EditText) findViewById(R.id.second);
        buttonB1=(Button) findViewById(R.id.button);
        buttonB2=(Button) findViewById(R.id.button2);
        buttonB3=(Button) findViewById(R.id.button3);

        resultText=(TextView) findViewById(R.id.result);




       View.OnClickListener onButtonClick= new View.OnClickListener() {
           @Override
           public void onClick(View v)
           {
               int firstNumber=Integer.parseInt(firstNumberN1.getText().toString());
               int secondNumber=Integer.parseInt(secondNumberN2.getText().toString());



               if(v.getId() == R.id.button)
               {
                   int result=firstNumber + secondNumber;

                   resultText.setText(String.valueOf(result));

               }

               if(v.getId() == R.id.button2)
               {
                   int result=firstNumber - secondNumber;
                   resultText.setText(String.valueOf(result));


               }

               if(v.getId() == R.id.button3)
               {
                   int result=firstNumber * secondNumber;
                   resultText.setText(String.valueOf(result));

               }




           }
       };

        buttonB1.setOnClickListener(onButtonClick);
        buttonB2.setOnClickListener(onButtonClick);
        buttonB3.setOnClickListener(onButtonClick);




    }
}
