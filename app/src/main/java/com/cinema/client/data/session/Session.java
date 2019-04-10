package com.cinema.client.data.session;

public class Session {
    private long id;
    private long hallId;
    private long movieId;
    private long showTimeInMills;

    public Session(long id, long hallId, long movieId, long showTimeInMills) {
        this.id = id;
        this.hallId = hallId;
        this.movieId = movieId;
        this.showTimeInMills = showTimeInMills;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHallId() {
        return hallId;
    }

    public void setHallId(long hallId) {
        this.hallId = hallId;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public long getShowTimeInMills() {
        return showTimeInMills;
    }

    public void setShowTimeInMills(long showTimeInMills) {
        this.showTimeInMills = showTimeInMills;
    }
}
