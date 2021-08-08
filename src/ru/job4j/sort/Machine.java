package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int cBack = money - price;
        int idxCoins = 0;
        while (cBack > 0) {
            for (; idxCoins < coins.length; idxCoins++) {
                if (cBack - coins[idxCoins] >= 0) {
                    rsl[size] = coins[idxCoins];
                    cBack -= coins[idxCoins];
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}