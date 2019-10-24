package com.example.shakil.androidrecyclertablayout.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shakil.androidrecyclertablayout.Adapter.ImageAdapter;
import com.example.shakil.androidrecyclertablayout.Model.Image;
import com.example.shakil.androidrecyclertablayout.R;

import java.util.ArrayList;
import java.util.List;

public class RedFragment extends Fragment {

    RecyclerView recycler_image;
    List<Image> imageList = new ArrayList<>();

    public RedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_red, container, false);

        recycler_image = itemView.findViewById(R.id.recycler_image);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recycler_image.setLayoutManager(layoutManager);
        recycler_image.setAdapter(new ImageAdapter(getActivity(), imageList));

        return itemView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        generateImageList();
    }

    private void generateImageList() {
        imageList.add(new Image("https://www.tripinsiders.net/wp-content/uploads/2016/12/sydnayxmas-768x512.jpg"));

        imageList.add(new Image("https://www.tripinsiders.net/wp-content/uploads/2016/12/washingtonxmas-768x432.jpg"));

        imageList.add(new Image("https://www.tripinsiders.net/wp-content/uploads/2016/12/lituaniaxmas-768x432.jpg"));

        imageList.add(new Image("https://www.tripinsiders.net/wp-content/uploads/2016/12/polandxmas-768x432.jpg"));

        imageList.add(new Image("https://www.tripinsiders.net/wp-content/uploads/2016/12/sydnayxmas-768x512.jpg"));

        imageList.add(new Image("https://www.tripinsiders.net/wp-content/uploads/2016/12/washingtonxmas-768x432.jpg"));

        imageList.add(new Image("https://www.tripinsiders.net/wp-content/uploads/2016/12/lituaniaxmas-768x432.jpg"));

        imageList.add(new Image("https://www.tripinsiders.net/wp-content/uploads/2016/12/polandxmas-768x432.jpg"));

        imageList.add(new Image("https://www.tripinsiders.net/wp-content/uploads/2016/12/sydnayxmas-768x512.jpg"));

        imageList.add(new Image("https://www.tripinsiders.net/wp-content/uploads/2016/12/washingtonxmas-768x432.jpg"));

        imageList.add(new Image("https://www.tripinsiders.net/wp-content/uploads/2016/12/lituaniaxmas-768x432.jpg"));

        imageList.add(new Image("https://www.tripinsiders.net/wp-content/uploads/2016/12/polandxmas-768x432.jpg"));
    }
}
