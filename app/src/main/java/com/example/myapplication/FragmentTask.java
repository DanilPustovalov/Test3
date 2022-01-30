package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class FragmentTask extends Fragment implements View.OnClickListener{
    public FragmentTask() {
        super(R.layout.tasks);
    }
    public void onViewCreated(View v, Bundle savedInstanceState){
        super.onViewCreated(v, savedInstanceState);
        Button next=v.findViewById(R.id.Next);
        next.setOnClickListener(this);
    }

        @Override
        public void onClick(View view){
            Intent intent=new Intent(getActivity().getApplication(), FragmentTask2.class);
            EditText text1 =view.findViewById(R.id.editTextAnswer);
            int count=0;
            if(text1.getText().toString()=="Hello, Earth"){
                count++;
            }
            intent.putExtra("count",count);
            startActivity(intent);
        }
    }
