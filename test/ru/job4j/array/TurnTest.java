package ru.job4j.array;


import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        /*
            напишите здесь тест, проверяющий переворот массива
            с нечётным числом элементов, например {1, 2, 3, 4, 5}.
         */
        int[] input = new int[] {5, 6, 7, 8, 9};
        int[] result = Turn.back(input);
        int[] expected = new int[] {9, 8, 7, 6, 5};
        Assert.assertArrayEquals(expected, result);
    }
}
