package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int cell = 0; cell < array[line].length; cell++) {
                if (array[line][cell] < 0) {
                    array[line][cell] = 0;
                }
            }
        }
        return array;
    }
}

