package com.codeclan.movielist;
import static org.junit.Assert.*;
import org.junit.*;

public class MovieTest {

    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;

    @Before
    public void Before() {
        movie1 = new Movie("Star Wars", "Sci Fi", 1);
        movie2 = new Movie("Inception", "Sci Fi", 4);
        movie3 = new Movie("Four Weddings", "Comedy", 3);
        movie4 = new Movie("Wall-E", "Animated", 2);
    }
    @Test
    public void toStringTest(){
        assertEquals("Title: 'Star Wars', Genre: 'Sci Fi', Ranking: 1", movie1.toString());
    }




}