package ru.netology.afisha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManegerTest {

    Maneger stat = new Maneger();

    @Test
    void getHowManyLastAddedFilm() {
        stat.setHowManyLastAddedFilm(5);

        int expected = 5;
        int actual = stat.getHowManyLastAddedFilm();

        assertEquals(expected, actual);
    }

    @Test
    void setHowManyLastAddedFilm() {
        stat.setHowManyLastAddedFilm(15);

        int expected = 15;
        int actual = stat.getHowManyLastAddedFilm();

        assertEquals(expected, actual);
    }

    @Test
    void constructorHowManyLastAddedFilm() {
        Maneger stat = new Maneger(15);

        int expected = 15;
        int actual = stat.getHowManyLastAddedFilm();

        assertEquals(expected, actual);
    }

    @Test
    void addNewNameFilm() {

        stat.addNewNameFilm("AAA");
        String[] expected = {"AAA"};
        String[] actual = stat.getNamesFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {

        stat.addNewNameFilm("AAA");
        stat.addNewNameFilm("BBB");
        stat.addNewNameFilm("CCC");
        stat.addNewNameFilm("DDD");
        stat.addNewNameFilm("EEE");
        stat.addNewNameFilm("FFF");
        stat.addNewNameFilm("GGG");
        stat.addNewNameFilm("HHH");
        stat.addNewNameFilm("III");
        stat.addNewNameFilm("JJJ");
        stat.addNewNameFilm("KKK");
        stat.addNewNameFilm("LLL");
        stat.findLast();

        String[] expected = {"LLL", "KKK", "JJJ", "III", "HHH", "GGG", "FFF", "EEE", "DDD", "CCC"};
        String[] actual = stat.getNamesFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastMin() {

        stat.addNewNameFilm("HHH");
        stat.addNewNameFilm("III");
        stat.addNewNameFilm("JJJ");
        stat.addNewNameFilm("KKK");
        stat.addNewNameFilm("LLL");

        stat.findLast();

        String[] expected = {"LLL", "KKK", "JJJ", "III", "HHH"};
        String[] actual = stat.getNamesFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastConstr5() {
        Maneger stat = new Maneger(5);
        stat.addNewNameFilm("AAA");
        stat.addNewNameFilm("BBB");
        stat.addNewNameFilm("CCC");
        stat.addNewNameFilm("DDD");
        stat.addNewNameFilm("EEE");
        stat.addNewNameFilm("FFF");
        stat.addNewNameFilm("GGG");
        stat.addNewNameFilm("HHH");
        stat.addNewNameFilm("III");
        stat.addNewNameFilm("JJJ");
        stat.addNewNameFilm("KKK");
        stat.addNewNameFilm("LLL");


        stat.findLast();

        String[] expected = {"LLL", "KKK", "JJJ", "III", "HHH"};
        String[] actual = stat.getNamesFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void testFindAll() {
        stat.addNewNameFilm("AAA");
        stat.addNewNameFilm("BBB");
        stat.addNewNameFilm("CCC");
        stat.addNewNameFilm("DDD");
        stat.addNewNameFilm("EEE");
        stat.addNewNameFilm("FFF");
        stat.addNewNameFilm("GGG");
        stat.addNewNameFilm("HHH");
        stat.addNewNameFilm("III");
        stat.addNewNameFilm("JJJ");
        stat.addNewNameFilm("KKK");
        stat.addNewNameFilm("LLL");

        stat.findAll();

        String[] expected = {"AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG", "HHH", "III", "JJJ", "KKK", "LLL"};
        String[] actual = stat.getNamesFilms();

        assertArrayEquals(expected, actual);
    }
}