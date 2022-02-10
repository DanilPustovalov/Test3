package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentTask2 extends Fragment implements View.OnClickListener {
    public FragmentTask2() {
        super(R.layout.task2);
    }
    int count;
    public void onViewCreated(View v, Bundle savedInstanceState){
        super.onViewCreated(v, savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            count = bundle.getInt("key");
        }
        Button rightanswer=v.findViewById(R.id.RigthAnswer);
        Button answ2=v.findViewById(R.id.answer2);
        Button answ3=v.findViewById(R.id.answer3);
        rightanswer.setOnClickListener(this);
        answ2.setOnClickListener(this);
        answ3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        ResultOfTasks yfc = new ResultOfTasks();
        Bundle bundle = new Bundle();
        if(view.getId()==R.id.RigthAnswer){
            count++;
        }
        bundle.putInt("key", count);
        yfc.setArguments(bundle);
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.task2, yfc);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
