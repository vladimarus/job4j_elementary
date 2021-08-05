package ru.job4j.loop;

public class Slash {

    public static void draw(int size) {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                char sign = ' ';
                if (x == y || (x + y == size - 1)) {
                    sign = 'O';
                }
                System.out.print(sign);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
