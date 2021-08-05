package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
//        3. Метод должен вернуть true, если переменная number является простым числом.
        boolean prime = number != 1;

        for (int i = 2; i < number; i++) { // i <= Math.ceil(Math.sqrt(number)) // оптимизация границы поиска
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
