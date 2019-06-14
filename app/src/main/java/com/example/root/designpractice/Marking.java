package com.example.root.designpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by root on 10/6/19.
 */

public class Marking extends Fragment {
    public Marking()
    {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        View marking_layout=inflater.inflate(R.layout.marking_fragment,container,false);
        Button button=marking_layout.findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"hiii3",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
                builder.setTitle("Dialog title here!!");
                builder.setCancelable(true);
                builder.setIcon(R.drawable.color);
                builder.setMessage("This is message you want to display");
                builder.show();
            }
        });


        return marking_layout;
    }
}
