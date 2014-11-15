package com.tictactoe;

/**
 * Created by MIKE on 14.11.2014.
 */
public class Field {

    public static final int FIELD_SIZE = 3;

    private static final char DEFAULT_VALUE = ' ';

    //создаем массив для поля
    public static char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    //блок очистки поля (заполнение стандартными значениями)
    public void eraseLine(int j) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            field[i][j] = DEFAULT_VALUE;
        }
    }

    public void eraseField() {
        for (int j = 0; j < FIELD_SIZE; j++) {
            eraseLine(j);
        }
    }

    //блок рисования поля
    public static void showLine(int j) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            System.out.print("[" + field[i][j] + "]");
        }
    }

    public static void showField() {
        for (int j = 0; j < FIELD_SIZE; j++) {
            showLine(j);
            System.out.println();
        }
    }

}
