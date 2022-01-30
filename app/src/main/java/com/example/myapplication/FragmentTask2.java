package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class FragmentTask2 extends Fragment implements View.OnClickListener {
    public FragmentTask2() {
        super(R.layout.task2);
    }
    int count;
    public void onViewCreated(View v, Bundle savedInstanceState){
        super.onViewCreated(v, savedInstanceState);
        Intent intent =getIntent();
        count=intent.getIntExtra("count");
        Button rightanswer=v.findViewById(R.id.RigthAnswer);
        Button answ2=v.findViewById(R.id.answer2);
        Button answ3=v.findViewById(R.id.answer3);
        rightanswer.setOnClickListener(this);
        answ2.setOnClickListener(this);
        answ3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent intent=new Intent(getActivity().getApplication(), ResultOfTasks.class);
        EditText text1 =view.findViewById(R.id.editTextAnswer);
        if(view.getId()==R.id.RigthAnswer){
            count++;
        }
        intent.putExtra("countF",count);
        startActivity(intent);
    }
}
