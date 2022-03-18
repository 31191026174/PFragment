package com.example.PFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;


public class ContentFrag extends Fragment {
    GridView gridView;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.content_frag, container, false);
        gridView = view.getRootView().findViewById(R.id.gridview);
        gridView.setOnItemClickListener((adapterView, view, i, l) -> {
            String s =adapterView.getItemAtPosition(i).toString();
            Intent intent = new Intent(view.getContext(), FullImage.class);
            intent.putExtra("url", s);
            startActivity(intent);
        });
        return view;
    }

    String[] rose = {
            "https://images.unsplash.com/photo-1496062031456-07b8f162a322?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8cm9zZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60",
            "https://images.unsplash.com/photo-1561238160-3fd50893667f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8cm9zZXxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60",
            "https://images.unsplash.com/photo-1547617774-2eb320ad93f5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTF8fHJvc2V8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"
        };
    String[] tulip = {
            "https://images.unsplash.com/photo-1586968295564-92fd7572718b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8dHVsaXB8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60",
            "https://images.unsplash.com/photo-1518701005037-d53b1f67bb1c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8dHVsaXB8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60",
            "https://images.unsplash.com/photo-1587316830148-c9b01df2da38?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8dHVsaXB8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60"
        };
    String[] lotus = {
            "https://images.unsplash.com/photo-1594882471743-2758d2ce5f00?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8bG90dXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60",
            "https://images.unsplash.com/photo-1474557157379-8aa74a6ef541?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8bG90dXN8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60",
            "https://images.unsplash.com/photo-1487139975590-b4f1dce9b035?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGxvdHVzfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"
        };


    public void updateContent(int position){
        switch (position){
            case 0:
                gridView.setAdapter(new ImageAdapter(getContext(),rose));
                break;
            case 1:
                gridView.setAdapter(new ImageAdapter(getContext(),tulip));
                break;
            case 2:
                gridView.setAdapter(new ImageAdapter(getContext(),lotus));
                break;
        }
    }





}
