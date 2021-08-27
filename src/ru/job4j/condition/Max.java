package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int op1, int op2, int op3) {
        return max(op1, max(op2, op3));
    }

    public static int max(int op1, int op2, int op3, int op4) {
        return max(op1, max(op2, op3, op4));
    }
}
