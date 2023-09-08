package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 30);
        Book book2 = new Book("Название_1", 40);
        Book book3 = new Book("Название_2", 90);
        Book book4 = new Book("Название_3", 120);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bo = books[i];
            System.out.println(bo.getName() + ", " + bo.getNumberOfPages());
        }
        System.out.println();
        System.out.println("Поменяли книги с индексом 0 и 3");
        Book book0 = books[0];
        books[0] = books[3];
        books[3] = book0;
        for (int i = 0; i < books.length; i++) {
            Book bo = books[i];
            System.out.println(bo.getName() + ", " + bo.getNumberOfPages());
        }
        System.out.println();
        System.out.println("Вывели книгу Clean code");
        for (int i = 0; i < books.length; i++) {
            Book bo = books[i];
            if ("Clean code".equals(bo.getName())) {
                System.out.println(bo.getName() + ", " + bo.getNumberOfPages());
            }
        }
    }
}
