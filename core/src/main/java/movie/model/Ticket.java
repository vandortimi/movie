package movie.model;

public class Ticket {
    private String cname;
    private Screening screening;
    private Seats seats;

    public Ticket (String cname, Screening screening, Seats seats){
        super ();
        this.cname = cname;
        this.screening = screening;
        this.seats = seats;
            }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Screening getScreening() {
        return screening;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }

    public Seats getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }
}



