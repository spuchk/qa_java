package ru.yandex.praktikum;

import java.util.List;

public class Lion {
    private boolean hasMane;
    private Feline feline;

    public Lion(String gender, Feline feline) throws Exception {
        if ("Самец".equals(gender)) {
            hasMane = true;
            this.feline = feline;
        } else if ("Самка".equals(gender)) {
            hasMane = false;
            this.feline = feline;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
