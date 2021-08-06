package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
//        - Массив на 10 элементов типа short с именем ages.
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
//        - Массив на 100500 элементов типа String c именем surnames.
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
//        - Массив на 40 элементов типа float с именем prices.
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
    }
}
