package com.cinema.client.data.movie;

import java.util.Random;

public class Movie {
    private long id;
    private String title;
    private String shortDescription;
    private String fullDescription;
    private String posterUrl;
    private long releaseDateInMills;

    public Movie(long id, String title, String shortDescription, String fullDescription, String posterUrl, long releaseDateInMills) {
        this.id = id;
        this.title = title;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.posterUrl = posterUrl;
        this.releaseDateInMills = releaseDateInMills;
    }

    public Movie(String title, String shortDescription, String fullDescription, String posterUrl) {
        this.id = new Random().nextLong();
        this.title = title;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.posterUrl = posterUrl;
        this.releaseDateInMills = System.currentTimeMillis();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public long getReleaseDateInMills() {
        return releaseDateInMills;
    }

    public void setReleaseDateInMills(long releaseDateInMills) {
        this.releaseDateInMills = releaseDateInMills;
    }
}
