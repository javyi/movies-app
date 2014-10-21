package com.videoshop.movies;

import java.util.List;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: javier
 * Date: 10/16/14
 * Time: 6:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieList {

    private List<Movie> movies;

    public MovieList(){
        this.movies = new ArrayList<Movie>();
    }

    public int size(){
        return this.movies.size();
    }

    public void add(Movie movie){
        this.movies.add(movie);
    }
}
