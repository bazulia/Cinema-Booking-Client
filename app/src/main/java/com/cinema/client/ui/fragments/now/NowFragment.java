package com.cinema.client.ui.fragments.now;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cinema.client.R;
import com.cinema.client.data.movie.Movie;
import com.cinema.client.data.movie.MoviesRepository;
import com.cinema.client.ui.adapters.MoviesAdapter;

public class NowFragment extends Fragment {

    private MoviesAdapter adapter = new MoviesAdapter();
    private RecyclerView moviesReyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_now, container, false);

        moviesReyclerView = view.findViewById(R.id.now_in_cinema_recycler_view);

        adapter.addItems(MoviesRepository.generateNewMovies());

        moviesReyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        moviesReyclerView.setAdapter(adapter);

        return view;
    }

}
