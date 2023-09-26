package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("123@mail.ru", "Ivanov Ivan");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            System.out.println(value);
        }
    }
}
