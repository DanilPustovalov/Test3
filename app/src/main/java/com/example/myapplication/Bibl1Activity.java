package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bibl1Activity extends AppCompatActivity implements View.OnClickListener{
    Button java=findViewById(R.id.java);
    Button cplus=findViewById(R.id.cplus);
    Button python=findViewById(R.id.python);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bibl1);
        java.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.java) {
            Intent intent = new Intent(this, JavaActivity.class);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            startActivity(intent);
        }else {
            Intent intent = new Intent(this, Fragm1.class);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            startActivity(intent);
            }
        }
}