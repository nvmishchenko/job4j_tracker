package ru.job4j.oop;

import net.sf.saxon.trans.Err;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        System.out.println();
        error = new Error(false, 3, "Сообщение 2");
        error.printInfo();
    }
}
