package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.Fragment;
public class Fragm1 extends Fragment implements View.OnClickListener{
    public Fragm1(){
        super(R.layout.fragment_first);
    }
    @Override
    public void onViewCreated(View v, Bundle savedInstanceState){
        super.onViewCreated(v, savedInstanceState);
        Button prev=v.findViewById(R.id.previous);
        prev.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(getActivity().getApplication(),Bibl1Activity.class);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(intent);
    }
}
