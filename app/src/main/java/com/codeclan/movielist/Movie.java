package com.codeclan.movielist;

import java.util.Comparator;

import static java.util.Collections.*;
public class Movie implements Comparable<Movie>{

    private String title;
    private String genre;
    private int ranking;

    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString(){
        return "Title: '" + this.getTitle() + "', Genre: '" + this.getGenre() + "', Ranking: "+  this.getRanking();
    }

    public int compareTo(Movie movie) {
        return this.ranking - movie.ranking ;
    }

    public void updateRanking(int newranking) {
        this.ranking = newranking;
    }

    public void downRank() {
        this.ranking -= 1;
    }

    public void upRank() {
        this.ranking += 1;
    }
}

