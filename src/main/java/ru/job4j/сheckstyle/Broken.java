package ru.job4j.сheckstyle;

public class Broken {

    private int sizeOfEmpty = 10;

    public String surname;

  //  public static final String newValue() = "";

    void echo() { }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}