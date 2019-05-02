package movie.model;

public enum Time {
    afternoon ("16:00"),
    evening ("20:00"),
    night ("22:00");

    private String time;

    private Time(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
