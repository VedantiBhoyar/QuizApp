package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button about,start;
EditText username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        about=(Button) findViewById(R.id.button2);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),AboutActivity.class);
                startActivity(intent);
            }
        });

        start=(Button) findViewById(R.id.button);
        username=findViewById(R.id.editTextText);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().length()>=1){
                    Intent intent=new Intent(getApplicationContext(),question1MainActivity.class);
                    intent.putExtra("Key",username.getText().toString().trim());
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"First Enter Your Name to Start a Quiz",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}