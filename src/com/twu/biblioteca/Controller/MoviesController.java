package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Model.Movies;
import com.twu.biblioteca.View.AppView;
import com.twu.biblioteca.View.MoviesView;

public class MoviesController {
    private Movies moviesModel;
    private MoviesView moviesView;
    private AppView appView;

    public MoviesController(Movies moviesModel, MoviesView moviesView, AppView appView) {

        this.moviesModel = moviesModel;
        this.moviesView = moviesView;
        this.appView = appView;
    }

    public void displayMovies() {
        moviesView.displayMovies(moviesModel.getMovies());
    }
}