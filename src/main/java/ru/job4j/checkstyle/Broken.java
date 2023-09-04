package ru.job4j.checkstyle;

public class Broken {

    public String surname;
    String name;
    public final String newValue = "";

    void echo() { }

    Broken() { }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c, int d, int e, int f, int g) {

    }

    private int sizeOfEmpty = 10;

}