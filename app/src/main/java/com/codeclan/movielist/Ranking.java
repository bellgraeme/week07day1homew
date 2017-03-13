package com.codeclan.movielist;


import java.util.ArrayList;
import java.util.Collections;

public class Ranking  {

   private ArrayList<Movie> ranking;

    public Ranking(){
        ranking = new ArrayList<Movie>();
    }

    public ArrayList<Movie> getRanking() {
        return ranking;
    }

    public void addMovie(Movie movie){
        this.ranking.add(movie);

    }

    public Movie getMovieByIndex(int index){
       return this.ranking.get(index);
    }

    public Movie findRank(int rank){
        return this.getMovieByIndex(rank - 1);
    }

    public void removeLastMovie(){
        this.ranking.remove(this.ranking.size() - 1);
    }

    public Movie findMovieByName(String name) {
        for (Movie movie : this.ranking) {
            if (movie.getTitle().equals(name)) {
              return movie;

            }
        }
        return null;
    }

    public  void downRanking(String name){
        Movie movie = this.findMovieByName(name);
        movie.downRank();

    }

    public  void upRanking(String name){
        Movie movie = this.findMovieByName(name);
        movie.upRank();

    }

    public int findIndex(Movie movie){
        return this.ranking.indexOf(movie);
    }
}
