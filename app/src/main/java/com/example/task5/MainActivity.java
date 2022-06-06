package com.example.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    int Number1, Number2, Result1, Result2 = 1, Result4;
    double Result3 = 1.0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ET1 = findViewById(R.id.Number1);
        EditText ET2 = findViewById(R.id.Number2);
        TextView TV1 = findViewById(R.id.SummationTV);
        TextView TV2 = findViewById(R.id.SummationRTV);
        TextView TV3 = findViewById(R.id.MultiplicationTV);
        TextView TV4 = findViewById(R.id.MultiplicationRTV);
        TextView TV5 = findViewById(R.id.DivisionTV);
        TextView TV6 = findViewById(R.id.DivisionRTV);
        TextView TV7 = findViewById(R.id.SubtractionTV);
        TextView TV8 = findViewById(R.id.SubtractionRTV);

        Button Btn = findViewById(R.id.button);

        Btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                /*Integer.valueOf(ET1.getText().toString());*/
                /*Number2 = Integer.parseInt(ET1.getText().toString());*/
                Number1 = Integer.parseInt(ET1.getText().toString());
                Number2 = Integer.parseInt(ET2.getText().toString());

                int Temp = Number1;
                while (Number1  <= Number2) //1   //4
                {
                    Result1+= Number1;
                    Number1++;
                }
                TV2.setText(String.valueOf(Result1));
                Number1 = Temp;
                while (Number1 <= Number2)
                {
                    Result2*= Number1;
                    Number1++;
                }
                TV4.setText(String.valueOf(Result2));

                Number1 = Temp;
                while (Number1 <= Number2)
                {
                    Result3/= Number1;
                    Number1++;
                }
                TV6.setText(String.valueOf(Result3));

                Number1 = Temp;
                while (Number2 >= Number1)
                {
                    Result4-= Number2;
                    Number2--;
                }
                TV8.setText(String.valueOf(Result4));

            }
        });




    }
}