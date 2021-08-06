package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {

        for (int i = 0; i < data.length; i++) {
            // найти минимум среди диапазона i - дата.длина
            int minValue = MinDiapason.findMin(data, i, data.length - 1);
            // индекс минимума среди диапазона i - дата.длина
            int minIndex = FindLoop.indexOf(data, minValue, i, data.length - 1);
            // свапнуть iй элемент с найденным
            SwitchArray.swap(data, i, minIndex);
        }
        return data;
    }

}
