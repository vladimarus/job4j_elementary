package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int side = data.length;
        int[] res = new int[side * side];
        int resCnt = 0;
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (data[i][j] != 0 && i + j != sum) {
                    res[resCnt++] = data[i][j];
                }
            }
        }
        return Arrays.copyOf(res, resCnt);
    }
}
