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
        stat.setNewNameFilm("AAA");
        stat.addNewNameFilm();

        String[] expected = {"AAA"};
        String[] actual = stat.getNamesFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast() {
        stat.setNewNameFilm("AAA");
        stat.addNewNameFilm();
        stat.setNewNameFilm("BBB");
        stat.addNewNameFilm();
        stat.setNewNameFilm("CCC");
        stat.addNewNameFilm();
        stat.setNewNameFilm("DDD");
        stat.addNewNameFilm();
        stat.setNewNameFilm("EEE");
        stat.addNewNameFilm();
        stat.setNewNameFilm("FFF");
        stat.addNewNameFilm();
        stat.setNewNameFilm("GGG");
        stat.addNewNameFilm();
        stat.setNewNameFilm("HHH");
        stat.addNewNameFilm();
        stat.setNewNameFilm("III");
        stat.addNewNameFilm();
        stat.setNewNameFilm("JJJ");
        stat.addNewNameFilm();
        stat.setNewNameFilm("KKK");
        stat.addNewNameFilm();
        stat.setNewNameFilm("LLL");
        stat.addNewNameFilm();

        stat.findLast();

        String[] expected = {"LLL", "KKK", "JJJ", "III", "HHH", "GGG", "FFF", "EEE", "DDD", "CCC"};
        String[] actual = stat.getNamesFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastMin() {
        stat.setNewNameFilm("HHH");
        stat.addNewNameFilm();
        stat.setNewNameFilm("III");
        stat.addNewNameFilm();
        stat.setNewNameFilm("JJJ");
        stat.addNewNameFilm();
        stat.setNewNameFilm("KKK");
        stat.addNewNameFilm();
        stat.setNewNameFilm("LLL");
        stat.addNewNameFilm();

        stat.findLast();

        String[] expected = {"LLL", "KKK", "JJJ", "III", "HHH"};
        String[] actual = stat.getNamesFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastConstr5() {
        Maneger stat = new Maneger(5);
        stat.setNewNameFilm("AAA");
        stat.addNewNameFilm();
        stat.setNewNameFilm("BBB");
        stat.addNewNameFilm();
        stat.setNewNameFilm("CCC");
        stat.addNewNameFilm();
        stat.setNewNameFilm("DDD");
        stat.addNewNameFilm();
        stat.setNewNameFilm("EEE");
        stat.addNewNameFilm();
        stat.setNewNameFilm("FFF");
        stat.addNewNameFilm();
        stat.setNewNameFilm("GGG");
        stat.addNewNameFilm();
        stat.setNewNameFilm("HHH");
        stat.addNewNameFilm();
        stat.setNewNameFilm("III");
        stat.addNewNameFilm();
        stat.setNewNameFilm("JJJ");
        stat.addNewNameFilm();
        stat.setNewNameFilm("KKK");
        stat.addNewNameFilm();
        stat.setNewNameFilm("LLL");
        stat.addNewNameFilm();

        stat.findLast();

        String[] expected = {"LLL", "KKK", "JJJ", "III", "HHH"};
        String[] actual = stat.getNamesFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void testFindAll() {
        stat.setNewNameFilm("AAA");
        stat.addNewNameFilm();
        stat.setNewNameFilm("BBB");
        stat.addNewNameFilm();
        stat.setNewNameFilm("CCC");
        stat.addNewNameFilm();
        stat.setNewNameFilm("DDD");
        stat.addNewNameFilm();
        stat.setNewNameFilm("EEE");
        stat.addNewNameFilm();
        stat.setNewNameFilm("FFF");
        stat.addNewNameFilm();
        stat.setNewNameFilm("GGG");
        stat.addNewNameFilm();
        stat.setNewNameFilm("HHH");
        stat.addNewNameFilm();
        stat.setNewNameFilm("III");
        stat.addNewNameFilm();
        stat.setNewNameFilm("JJJ");
        stat.addNewNameFilm();
        stat.setNewNameFilm("KKK");
        stat.addNewNameFilm();
        stat.setNewNameFilm("LLL");
        stat.addNewNameFilm();

        String[] expected = {"AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG", "HHH", "III", "JJJ", "KKK", "LLL"};
        String[] actual = stat.getNamesFilms();

        assertArrayEquals(expected, actual);
    }
}