package ru.netology.afisha;

public class Maneger {
    private String newNameFilm;
    private int howManyLastAddedFilm = 10;
    private String[] namesFilms = {};


    public Maneger() {
    }

    public Maneger(int howManyLastAddedFilm) {
        this.howManyLastAddedFilm = howManyLastAddedFilm;
    }

    public int getHowManyLastAddedFilm() {
        return howManyLastAddedFilm;
    }

    public String[] getNamesFilms() {
        return namesFilms;
    }

    public void setHowManyLastAddedFilm(int howManyLastAddedFilm) {
        if (howManyLastAddedFilm < 1) {
            return;
        }
        this.howManyLastAddedFilm = howManyLastAddedFilm;
    }

    public void setNewNameFilm(String newNameFilm) {
        this.newNameFilm = newNameFilm;
    }

    public void addNewNameFilm() {
        String[] tmp = new String[namesFilms.length + 1];
        for (int i = 0; i < namesFilms.length; i++) {
            tmp[i] = namesFilms[i];
        }
        tmp[tmp.length - 1] = newNameFilm;
        namesFilms = tmp;
    }

    public void findAll() {
        getNamesFilms();
    }

    public void findLast() {
        if (namesFilms.length < howManyLastAddedFilm - 1) {
            String[] tmp = new String[namesFilms.length];
            int indexTo = 0;
            for (int i = namesFilms.length - 1; i >= 0; i--) {
                tmp[indexTo] = namesFilms[i];
                indexTo++;
            }
            namesFilms = tmp;
        } else {
            int indexMax = namesFilms.length - howManyLastAddedFilm - 1;
            String[] tmp = new String[howManyLastAddedFilm];
            int indexTo = 0;
            for (int i = namesFilms.length - 1; i > indexMax; i--) {
                tmp[indexTo] = namesFilms[i];
                indexTo++;
            }
            namesFilms = tmp;
        }

    }
}