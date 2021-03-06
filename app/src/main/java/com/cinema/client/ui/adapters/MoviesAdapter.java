package com.cinema.client.ui.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cinema.client.R;
import com.cinema.client.data.movie.Movie;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {

    private List<Movie> movies = new ArrayList<>();

    public void addItem(Movie newMovie){
        movies.add(newMovie);
        notifyItemInserted(movies.size()-1);
    }

    public void addItems(List<Movie> newMovies){
        for(int i = 0; i < newMovies.size();i++){
            addItem(newMovies.get(i));
        }
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_list_item,viewGroup,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder viewHolder, int position) {
        viewHolder.bindData(movies.get(position));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{
        private TextView titleTextView;
        private ImageView posterImageView;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.movie_item_title);
            posterImageView = itemView.findViewById(R.id.movie_item_poster);
        }

        public void bindData(Movie movie){
            titleTextView.setText(movie.getTitle());
            Picasso.get().load(movie.getPosterUrl()).into(posterImageView);
        }
    }

}
