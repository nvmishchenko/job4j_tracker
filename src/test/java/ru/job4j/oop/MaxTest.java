package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int rsl = Max.max(left, right);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void when123To3() {
        int left = 1;
        int right = 2;
        int first = 3;
        int expected = 3;
        int rsl = Max.max(left, right, first);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void when5462To6() {
        int left = 5;
        short right = 4;
         int first = 6;
        char second = 2;
        int expected = 6;
        int rsl = Max.max(left, right, first);
        assertThat(rsl).isEqualTo(expected);
    }

}