package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = findViewById(R.id.textView);
        EditText Edit1 = findViewById(R.id.Edit1);
        EditText Edit2 = findViewById(R.id.Edit2);
        EditText Edit3 = findViewById(R.id.Edit3);
        EditText Edit4 = findViewById(R.id.Edit4);
        Button button = findViewById(R.id.button);
        TextView textView2 = findViewById(R.id.textView2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 = Integer.parseInt(Edit1.getText().toString());
                int num2 = Integer.parseInt(Edit2.getText().toString());
                int num3 = Integer.parseInt(Edit3.getText().toString());
                int num4 = Integer.parseInt(Edit4.getText().toString());

                int result = num1 + num2 + num3 + num4;

                textView2.setText(String.valueOf(result ));


            }
        });
    }
}