package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double delta = 0.001;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, delta);
    }

    @Test
    public void when11to45Then2() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 5;
        double expected = 5;
        double delta = 0.001;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, delta);
    }

    @Test
    public void when33to22Then1414() {
        int x1 = 3;
        int y1 = 3;
        int x2 = 2;
        int y2 = 2;
        double expected = 1.414;
        double delta = 0.001;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, delta);
    }
}