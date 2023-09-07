package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int first) {
        return max(max(left, right), first);
    }

    public static int max(int left, int right, int first, int second) {
        return max(max(left, right), max(first, second));
    }
}
