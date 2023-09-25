package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public HashSet<String> extractNumber(List<Task> values) {
        HashSet<String> tasks = new HashSet<>();
        for (Task value : values) {
            tasks.add(value.getNumber());
        }
        return tasks;
    }
}
