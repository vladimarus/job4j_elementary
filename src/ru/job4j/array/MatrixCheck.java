package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int col = 0; col < board[row].length; col++) {
            if (board[row][col] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int idx = 0; idx < board.length; idx++) {
            rsl[idx] = board[idx][idx];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        char[] hrs = extractDiagonal(board);
        for (int idx = 0; idx < board.length; idx++) {
            if (hrs[idx] == 'X' && (monoHorizontal(board, idx) || monoVertical(board, idx))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
