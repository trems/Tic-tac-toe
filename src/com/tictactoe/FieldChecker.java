package com.tictactoe;

/**
 * Created by MIKE on 14.11.2014.
 */
public class FieldChecker {

    public static final String defaultWinner = "Nobody wins";

    private static String winner = defaultWinner;

    private static void setWinner(String winner) {
        FieldChecker.winner = winner;
    }

    public static String getWinner() {
        return winner;
    }

    public static void checkWinner() {
        checkWinHorizontalLines();
        checkWinVerticalLines();
        checkWinFirstDiagonal();
        checkWinSecondDiagonal();
    }


    //эта проверка нагло спёрта с просторов интернета потому что я тупой и не мог сам это реализовать
    public static boolean isFieldFull() {
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Field.field[i][j] == ' ') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    public static void fieldIsFull() {
        if (isFieldFull() == true) {
            Field.showField();
            System.out.println("Field is full. Nobody wins");
        }
    }

    private static void checkWinHorizontalLines() {
        for (int i = 0; i < Field.FIELD_SIZE; i++) {
            if (Field.field[0][i] == 'x' && Field.field[1][i] == 'x' && Field.field[2][i] == 'x') {
                setWinner("Player X");
            } if (Field.field[0][i] == 'o' && Field.field[1][i] == 'o' && Field.field[2][i] == 'o') {
                setWinner("Player O");
            }
        }
    }

    private static void checkWinVerticalLines() {
        for (int i = 0; i < Field.FIELD_SIZE; i++) {
            if (Field.field[i][0] == 'x' && Field.field[i][1] == 'x' && Field.field[i][2] == 'x') {
                setWinner("Player X");
            } if (Field.field[i][0] == 'o' && Field.field[i][1] == 'o' && Field.field[i][2] == 'o') {
                setWinner("Player O");
            }
        }
    }

    private static void checkWinFirstDiagonal() {
        if (Field.field[0][0] == 'x' && Field.field[1][1] == 'x' && Field.field[2][2] == 'x') {
            setWinner("Player X");
        } if (Field.field[0][0] == 'o' && Field.field[1][1] == 'o' && Field.field[2][2] == 'o') {
            setWinner("Player O");
        }
    }

    private static void checkWinSecondDiagonal() {
        if (Field.field[0][2] == 'x' && Field.field[1][1] == 'x' && Field.field[2][0] == 'x') {
            setWinner("Player X");
        } if (Field.field[0][2] == 'o' && Field.field[1][1] == 'o' && Field.field[2][0] == 'o') {
            setWinner("Player O");
        }
    }

}
