package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Николай");
        student.setGroup(1);
        student.setDateOfReceipt("07.09.2023");
        System.out.println(student.getName());
        System.out.println(student.getGroup());
        System.out.println(student.getDateOfReceipt());
    }
}
