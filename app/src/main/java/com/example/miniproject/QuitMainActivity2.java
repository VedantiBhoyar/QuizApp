package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuitMainActivity2 extends AppCompatActivity {
TextView correct,wrong,finalScore;
Button restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quit_main2);

        correct=findViewById(R.id.textView5);
        wrong=findViewById(R.id.textView6);
        finalScore=findViewById(R.id.textView7);

Intent intent=getIntent();
int rightQuestion = intent.getIntExtra("Score", 0);
int wrongQuestion=intent.getIntExtra("Wrong",0);
correct.setText(correct.getText()+"  "+rightQuestion);

finalScore.setText(finalScore.getText()+" : "+rightQuestion*4);
wrong.setText(wrong.getText()+" : "+wrongQuestion);

        restart=(Button) findViewById(R.id.button4);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });





    }
}