package com.example.shakil.androidrecyclertablayout.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shakil.androidrecyclertablayout.Adapter.MovieAdapter;
import com.example.shakil.androidrecyclertablayout.Common.Common;
import com.example.shakil.androidrecyclertablayout.Interface.RetrofitService;
import com.example.shakil.androidrecyclertablayout.Model.Movie;
import com.example.shakil.androidrecyclertablayout.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PinkFragment extends Fragment {

    RecyclerView recyclerMovie;
    RetrofitService mService;
    RecyclerView.LayoutManager layoutManager;
    MovieAdapter adapter;

    public PinkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View itemView = inflater.inflate(R.layout.fragment_pink, container, false);

        recyclerMovie = itemView.findViewById(R.id.recyclerMovie);

        mService = Common.getovies();

        recyclerMovie.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerMovie.setLayoutManager(layoutManager);

        getAllMovieList();

        return itemView;
    }

    private void getAllMovieList() {
        mService.getAllMovies().enqueue(new Callback<List<Movie>>() {
            @Override
            public void onResponse(Call<List<Movie>> call, Response<List<Movie>> response) {
                adapter = new MovieAdapter(getActivity(), response.body());
                adapter.notifyDataSetChanged();
                recyclerMovie.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Movie>> call, Throwable t) {

            }
        });
    }
}
