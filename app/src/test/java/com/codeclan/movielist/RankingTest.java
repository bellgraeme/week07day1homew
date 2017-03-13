package com.codeclan.movielist;


import static java.util.Collections.*;
import static org.junit.Assert.*;
import org.junit.*;

import java.util.*;

public class RankingTest {
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Ranking ranking;

    @Before
    public void Before() {
        ranking = new Ranking();
        movie1 = new Movie("Star Wars", "Sci Fi", 1);
        movie2 = new Movie("Inception", "Sci Fi", 4);
        movie3 = new Movie("Four Weddings", "Comedy", 3);
        movie4 = new Movie("Wall-E", "Animated", 2);
    }

    @Test
    public void canAdddMovieTest() {
        ranking.addMovie(movie1);
        ArrayList<Movie> list = ranking.getRanking();
        assertEquals(1, list.size());
    }

    @Test
    public void rankingIndexTest() {
        ArrayList<Movie> list = ranking.getRanking();
        ranking.addMovie(movie2);
        ranking.addMovie(movie4);
        ranking.addMovie(movie1);
        ranking.addMovie(movie3);

        Collections.sort(list);
        Movie movie = ranking.getMovieByIndex(1);
        assertEquals(2, movie.getRanking());
    }



    @Test
    public void findMovieByRanking() {
        ranking.addMovie(movie2);
        ranking.addMovie(movie4);
        ranking.addMovie(movie1);
        ranking.addMovie(movie3);
        ArrayList<Movie> list = ranking.getRanking();
        Collections.sort(list);
        Movie movie = ranking.findRank(2);
        assertEquals("Wall-E", movie.getTitle());
    }

    @Test
    public void removeLastTest() {
        ranking.addMovie(movie2);
        ranking.addMovie(movie4);
        ranking.addMovie(movie1);
        ranking.addMovie(movie3);
        ArrayList<Movie> list = ranking.getRanking();
        Collections.sort(list);
        ranking.removeLastMovie();
        assertEquals(3, ranking.getRanking().size());
    }

    @Test
    public  void findMovieByNameTest(){
        ranking.addMovie(movie2);
        ranking.addMovie(movie4);
        ranking.addMovie(movie1);
        ranking.addMovie(movie3);
        Movie movie = ranking.findMovieByName("Wall-E");
        assertEquals("Wall-E", movie.getTitle());
    }

    @Test
    public void downRankTest(){
        ranking.addMovie(movie2);
        ranking.addMovie(movie4);
        ranking.addMovie(movie1);
        ranking.addMovie(movie3);
        ArrayList<Movie> list = ranking.getRanking();
        Movie movie = ranking.getMovieByIndex(3);
        String title = movie.getTitle();
        ranking.downRanking(title);
        Collections.sort(list);
        Movie newMovie =  ranking.findMovieByName(title);
        int updated = ranking.findIndex(newMovie);
        assertEquals(2, updated);

    }

}
