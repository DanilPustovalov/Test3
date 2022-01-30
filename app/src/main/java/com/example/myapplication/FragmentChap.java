package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.Fragment;
public class FragmentChap extends Fragment implements View.OnClickListener{

    public FragmentChap() {
        super(R.layout.chapters);
    }
    public void onViewCreated(View v, Bundle savedInstanceState){
        super.onViewCreated(v, savedInstanceState);
        Button prev=v.findViewById(R.id.back);
        prev.setOnClickListener(this);
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