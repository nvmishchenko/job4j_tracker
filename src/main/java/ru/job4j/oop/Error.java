package ru.job4j.oop;

import net.sf.saxon.trans.Err;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
        active = true;
        status = 2;
        message = "Сообщение 1";
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(2);
        System.out.println(message);
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        System.out.println();
        error = new Error(false, 3, "Сообщение 2");
        error.printInfo();
    }
}
