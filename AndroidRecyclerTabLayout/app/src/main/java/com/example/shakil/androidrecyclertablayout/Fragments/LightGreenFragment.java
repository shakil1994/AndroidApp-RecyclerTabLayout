package com.example.shakil.androidrecyclertablayout.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.shakil.androidrecyclertablayout.R;

public class LightGreenFragment extends Fragment {

    public LightGreenFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_light_green, container, false);
        return itemView;
    }
}
