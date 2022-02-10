package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentTask extends Fragment implements View.OnClickListener{
    public FragmentTask() {
        super(R.layout.tasks);
    }
    EditText text1;
    public void onViewCreated(View v, Bundle savedInstanceState){
        super.onViewCreated(v, savedInstanceState);
        Button next=v.findViewById(R.id.Next);
        text1 =v.findViewById(R.id.editTextAnswer);
        next.setOnClickListener(this);
    }
        int count=0;
        @Override
        public void onClick(View view){
            FragmentTask2 yfc = new FragmentTask2();
            Bundle bundle = new Bundle();
            if(text1.getText().toString()=="Hello, Earth"){
                count++;
            }
            bundle.putInt("key", count);
            yfc.setArguments(bundle);
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.task, yfc);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
