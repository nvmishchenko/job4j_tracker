package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        a.distance(b);
        int expected = 2;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when01To23Then2dot82() {
        Point a = new Point(1, 0);
        Point b = new Point(3, 2);
        a.distance(b);
        double expected = 2.82;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when32To10Then2dot82() {
        Point a = new Point(2, 3);
        Point b = new Point(0, 1);
        a.distance(b);
        double expected = 2.82;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when73To115Then4dot47() {
        Point a = new Point(3, 7);
        Point b = new Point(5, 11);
        a.distance(b);
        double expected = 4.47;
        assertThat(a.distance(b)).isEqualTo(expected, withPrecision(0.01));
    }
}