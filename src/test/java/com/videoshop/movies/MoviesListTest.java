package com.videoshop.movies;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.*;


/**
 * Created with IntelliJ IDEA.
 * User: javier
 * Date: 10/16/14
 * Time: 6:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class MoviesListTest {

    MovieList movieList;

    @Before
    public void setUp() throws Exception{
        movieList = new MovieList();
    }

    @Test
    public void emptyListSize() throws Exception{
        assertThat(movieList.size(),is(0));
    }

    @Test
    public void sizeAfterAddingOneMovie() throws Exception{
        Movie starWars = new Movie("Star Wars");
        movieList.add(starWars);
        assertThat(movieList.size(), is(1));
    }


}
