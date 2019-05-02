package movie.model;

import javax.management.monitor.StringMonitor;

public enum Seats {
    A1("free"),
    A2("free"),
    A3("free"),
    B1("free"),
    B2("free"),
    B3("free"),
    C1("free"),
    C2("free"),
    C3("free");

    private String reservation;

    Seats(String reservation) {
        this.reservation = reservation;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }
}

