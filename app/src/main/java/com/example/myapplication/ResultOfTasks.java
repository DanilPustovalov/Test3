   package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

   public class ResultOfTasks extends Fragment  implements View.OnClickListener{

    public ResultOfTasks() {
        super(R.layout.result_of_tasks);
    }
    int count;
    @Override
    public void onViewCreated(View v, Bundle savedInstanceState){
        super.onViewCreated(v, savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            count = bundle.getInt("key");
        }
        Button button1=v.findViewById(R.id.back_j);
        button1.setOnClickListener(this);
        TextView textView=v.findViewById(R.id.res);
        textView.setText("Вы ответили правильно на "+count+" из 2");
    }


    @Override
    public void onClick(View v) {
        Intent intent=new Intent(getActivity().getApplication(),JavaActivity.class);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(intent);
        
    }
}