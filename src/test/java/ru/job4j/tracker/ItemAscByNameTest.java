package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {

    @Test
    void whenItemAscByName() {
        List<Item> items = Arrays.asList(new Item("ten", 10), new Item("one", 1),
                new Item("five", 5), new Item("six", 6));
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(new Item("five", 5), new Item("one", 1),
                new Item("six", 6), new Item("ten", 10));
        assertThat(items).isEqualTo(expected);
    }
}