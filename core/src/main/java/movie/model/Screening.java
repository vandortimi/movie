package movie.model;

public class Screening {

    private Movie movie;
    private Time time;

    public Screening ( Movie movie, Time time) {
        super();
        this.movie = movie;
        this.time = time;
    }

    public Screening screening;
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }


}
