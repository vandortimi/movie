package movie;

import movie.model.Movie;
import movie.model.Screening;
import movie.model.Time;
import movie.service.DuplicatedMovieEntryException;
import movie.service.EntryNotFoundException;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class ScreeningFileDAO implements ScreeningDAO {


        private static final String FIELD_SEPARATOR = ";";
    public static Object createScreening;


    public ScreeningFileDAO() {
        super();

    }


    public Collection<Screening> createScreening(Screening screening) throws DuplicatedMovieEntryException {
            Collection<Screening> screenings = readScreening();
            if(screenings.contains(screenings)) {
                throw new DuplicatedMovieEntryException(screenings.toString());
            }
            screenings.add(screening);
            System.out.println(screening);
            overrideDatabase(screenings);
        return screenings;
    }
        @Override
        public Collection<Screening> readScreening() {
            Collection<Screening> result = new ArrayList<Screening>();
            String line = null;
            try {
                BufferedReader br = new BufferedReader(new FileReader("screening.csv"));
                while((line = br.readLine()) != null) {
                    String[] fields = line.split(FIELD_SEPARATOR);
                    if(fields.length!= 2) {
                        continue;
                    }
                    Movie movie = Movie.valueOf(fields[0]);
                    Time time = Time.valueOf(fields[1]);
                    result.add(new Screening(movie, time));
                    System.out.println("siker");
                }
            }
            catch(IOException e) {
                System.out.println(e);
            }
            return result;
        }

    public void updateScreening(Screening screening) throws EntryNotFoundException {
            // TODO Auto-generated method stub
        }
        public void deleteScreening(Screening screening) throws EntryNotFoundException {
            Collection<Screening> screenings = readScreening ();
            if(screenings.contains(screening) == false) {
                throw new EntryNotFoundException(screening.toString());
            }
            screenings.remove(screening);
            System.out.println("törlés");
            overrideDatabase(screenings);
        }

        private String marshal2record(Screening screening) {
            return ""+
                    screening.getMovie().toString()+FIELD_SEPARATOR+
                    screening.getTime()+FIELD_SEPARATOR;
        }

        private void overrideDatabase(Collection<Screening> screenings) {
            PrintWriter writer;
            try {
                writer = new PrintWriter(new FileWriter("screening.txt", false));
                for(Screening screening : screenings) {
                    writer.println(marshal2record(screening)+"\n");
                }
                writer.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }

