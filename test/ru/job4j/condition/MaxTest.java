package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMaxLeftThenLeft() {
        int l = 10;
        int r = 5;
        int expect = 10;
        int actual = Max.max(l, r);
        assertEquals(expect, actual);
    }

    @Test
    public void whenMaxRightThenRight() {
        int l = 10;
        int r = 15;
        int expect = 15;
        int actual = Max.max(l, r);
        assertEquals(expect, actual);
    }

    @Test
    public void whenEqualThenAny() {
        int l = 10;
        int r = 10;
        int expect = 10;
        int actual = Max.max(l, r);
        assertEquals(expect, actual);
    }
}