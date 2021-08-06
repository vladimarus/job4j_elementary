package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {

        int[][] matrix = new int[size][size];

        for (int line = 0; line < matrix.length; line++) {
            for (int cell = 0; cell < matrix[line].length; cell++) {
                matrix[line][cell] = (line + 1) * (cell + 1);
            }
        }
        return matrix;
    }
}
