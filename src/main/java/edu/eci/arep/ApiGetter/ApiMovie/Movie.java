package edu.eci.arep.ApiGetter.ApiMovie;

import edu.eci.arep.ApiGetter.ApiGetter;

/**
 * Constructor Movie
 */
public class Movie extends MovieGetter {
    public Movie(String movie) {
        super(movie);
        buildParameters();
    }
}
