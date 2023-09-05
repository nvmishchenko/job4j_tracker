package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int first) {
        return max(max(left, right), first) > max(left, right) ? max(max(left, right), first) : max(left, right);
    }

    public static int max(int left, short right, int first, char second) {
        return max(max(left, right, first), second) > max(left, right) ? max(max(left, right, first), second)
                : max(left, right);
    }

    public static int max(int second, int left, short right, int first) {
        return max(max(left, right, first), second) > max(left, right) ? max(max(left, right, first), second)
                : max(left, right);
    }
}
