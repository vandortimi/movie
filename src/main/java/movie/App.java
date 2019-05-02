package movie;

import movie.model.Movie;
import movie.model.Screening;
import movie.model.Seats;
import movie.model.Time;
import movie.service.DuplicatedMovieEntryException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  {

    Screening screening= new Screening(Movie.Vasember,Time.night );

        ScreeningController screeningController = new ScreeningController(new ScreeningService());
        ScreeningService screeningService = new ScreeningService();



    }
}
