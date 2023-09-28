package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {

    @Test
    void whenItemDescByName() {
        List<Item> items = Arrays.asList(new Item("ten", 10), new Item("one", 1),
                new Item("five", 5), new Item("six", 6));
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(new Item("ten", 10), new Item("six", 6),
                new Item("one", 1), new Item("five", 5));
        assertThat(items).isEqualTo(expected);
    }
}