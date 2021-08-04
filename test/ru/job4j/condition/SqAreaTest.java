package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double delta = 0.01;
        double actual = SqArea.square(p, k);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void whenP15K3Then1054() {
        double p = 15;
        double k = 3;
        double expected = 10.54;
        double delta = 0.01;
        double actual = SqArea.square(p, k);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void whenP16K4Then1024() {
        double p = 16;
        double k = 4;
        double expected = 10.24;
        double delta = 0.01;
        double actual = SqArea.square(p, k);
        assertEquals(expected, actual, delta);
    }
}