package com.example.root.designpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by root on 10/6/19.
 */

public class Design extends Fragment {
    public Design()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        //Initiate the layout for fragment
        View design_layout=inflater.inflate(R.layout.fragment_design,container,false);
        Button button=design_layout.findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"hiii1",Toast.LENGTH_SHORT).show();
            }
        });


        return design_layout;
    }
}
