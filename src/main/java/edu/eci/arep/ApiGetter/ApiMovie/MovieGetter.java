package edu.eci.arep.ApiGetter.ApiMovie;

import edu.eci.arep.ApiGetter.ApiGetter;

public class MovieGetter extends ApiGetter {
    private static final String URL = "http://www.omdbapi.com/?t=";
    private static final String PLOT = "&plot=full";
    private static final String API_KEY = "&apikey=d2233b52";

    /**
     * Constructor MovieGetter
     */
    public MovieGetter(String movie) {
        super(URL, PLOT, API_KEY);
        buildParameters();
        input.add(movie);
        buildQuery();
    }

    /**
     * Metodo que añade el parametro para la consulta
     *
     */
    public void buildParameters() {
        parameters.add("");
    }
}
