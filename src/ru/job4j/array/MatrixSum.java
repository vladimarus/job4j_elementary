package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] line : array) {
            for (int cell : line) {
                rsl += cell;
            }
        }
        return rsl;
    }
}
