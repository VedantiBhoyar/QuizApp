package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class question1MainActivity extends AppCompatActivity {
    String[]questions={"Which method can be defined only once in a program?","Which keyword is used by method to refer to the current object that invoked it?","Which of these access specifiers can be used for an interface?","Which of the following is correct way of importing an entire package ‘pkg’?","What is the return type of Constructors?"};

    String answer[]={"main method","this","public","import pkg.*","None of the mentioned"};

    String options[]={"finalize method","main method","static method","private method",
            "import","this","catch","abstract",
            "public","protected","private","All of the mentioned",
            "Import pkg.","import pkg.*","Import pkg.*","import pkg.",
            "int","float","void","None of the mentioned",};

    TextView name,score,displayQuestion;
    int correct=0,wrong=0;
    Button quit,next;
    RadioButton A,B,C,D;
    RadioGroup radio_group;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1_main);

        name=(TextView) findViewById(R.id.DispName);
        String textName= "Hello"+" "+getIntent().getStringExtra("Key").toString();
        name.setText(textName);

        A=findViewById(R.id.radioButton);
        B=findViewById(R.id.radioButton2);
        C=findViewById(R.id.radioButton3);
        D=findViewById(R.id.radioButton4);
        A.setText(options[0]);
        B.setText(options[1]);
        C.setText(options[2]);
        D.setText(options[3]);

        radio_group=findViewById(R.id.answersgrp);

        displayQuestion=(TextView) findViewById(R.id.tvque);
        displayQuestion.setText(questions[flag]);

        next=findViewById(R.id.button3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
if(radio_group.getCheckedRadioButtonId()==-1){
    Toast.makeText(getApplicationContext(),"Please select one of the option......",Toast.LENGTH_LONG).show();
    return;
}
   RadioButton button=findViewById(radio_group.getCheckedRadioButtonId());
    String ans=button.getText().toString();

    score=findViewById(R.id.textView4);
    if(ans.equals(answer[flag])){
        correct++;
        Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT).show();
    }else{
        wrong++;
        Toast.makeText(getApplicationContext(),"Wrong",Toast.LENGTH_SHORT).show();
    }
    flag++;
    radio_group.clearCheck();
    if(score!=null){
        score.setText(""+correct);
    }
    if(flag<questions.length){
        displayQuestion.setText(questions[flag]);
        A.setText(options[flag*4]);
        B.setText(options[flag*4+1]);
        C.setText(options[flag*4 +2]);
        D.setText(options[flag*4+3]);
    }else{
        Intent intent=new Intent(question1MainActivity.this,QuitMainActivity2.class);
        intent.putExtra("Score",correct);
        intent.putExtra("Wrong",wrong);
        startActivity(intent);
    }
}

        });

        quit=(Button) findViewById(R.id.buttonquit);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent intent=new Intent(getApplicationContext(), QuitMainActivity2.class);
startActivity(intent);
            }
        });

    }
}