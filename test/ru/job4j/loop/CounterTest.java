package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumByEvenFrom55To60Then174() {
        int start = 55;
        int finish = 60;
        int result = Counter.sumByEven(start, finish);
        int expected = 174;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumByEvenFromMinus5To5Then12() {
        int start = -5;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}