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

    @Test
    public void when3Max33Then33() {
        int op1 = 3;
        int op2 = 33;
        int op3 = 10;
        int expect = 33;
        int actual = Max.max(op1, op2, op3);
        assertEquals(expect, actual);
    }

    @Test
    public void when4Max55Then55() {
        int op1 = 44;
        int op2 = 44;
        int op3 = 55;
        int op4 = 55;
        int expect = 55;
        int actual = Max.max(op1, op2, op3, op4);
        assertEquals(expect, actual);
    }
}