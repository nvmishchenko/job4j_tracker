package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("123@mail.ru", "Ivanov Ivan");
        map.put("1234@mail.ru", "Ivanov Ivan");
        map.put("12332@mail.ru", "Ivanov Ivan");
        map.put("12398@mail.ru", "Ivanov Ivan98");
        map.put("12378@mail.ru", "Ivanov Ivan78");
        map.put("123@mail.ru", "Ivanov Ivan65");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            System.out.println(value);
        }
    }
}
