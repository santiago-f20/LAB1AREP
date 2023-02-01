package edu.eci.arep;

import static spark.Spark.*;
import spark.Request;
import java.io.*;
import edu.eci.arep.ApiGetter.ApiMovie.Movie;

public class HttpServer {

    /**
     * Metodo que inicia el servidor
     *
     * @param args
     */
    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/static");
        get("/movie", (req, res) -> {
            res.type("application/json");
            return identifyMovie(req);
        });
    }

    /**
     * Metodo que identifica el nombre de la pelicula a consultar
     *
     * @param req
     * @return
     * @throws IOException
     */
    private static String identifyMovie(Request req) throws IOException {
        String movie = new Movie(req.queryParams("movie")).getJson();
        return movie;
    }

    /**
     * Metodo que obtiene el puerto
     *
     * @return
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 35000;
    }
}

// http://www.omdbapi.com/?t=the+godfather&plot=full&apikey=d2233b52

// java -cp target/classes;target/dependency/* edu.eci.arep.HttpServer