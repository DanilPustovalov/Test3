package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JavaActivity extends AppCompatActivity implements View.OnClickListener{
    final int NumCh=2;
    TextView[] chapters= new TextView[NumCh];
    TextView[] tasks= new TextView[NumCh];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java);
        chapters[0]=findViewById(R.id.a1);
        tasks[0]=findViewById(R.id.b1);
        chapters[0].setOnClickListener(this);
        tasks[0].setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.a1){
           getSupportFragmentManager().beginTransaction()
                    .add(android.R.id.content, new FragmentChap()).commit();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            getSupportFragmentManager().beginTransaction()
                    .add(android.R.id.content, new FragmentTask()).commit();
        }
    }
}