package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int maxIndex = array.length - 1;
        for (int i = 0; i < (array.length / 2); i++) {
            SwitchArray.swap(array, i, maxIndex - i);
        }
        return array;
    }
}
