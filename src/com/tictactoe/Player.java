package com.tictactoe;

/**
 * Created by MIKE on 14.11.2014.
 */
public class Player {

    public boolean settingSuccess = false;

    public void setX(int x, int y) {
        if (Field.field[x][y] == 'x' | Field.field[x][y] == 'o') {
            System.out.println("This cell already set!");
            settingSuccess = false;
        } else {
            Field.field[x][y] = 'x';
            settingSuccess = true;
        }

    }

    public void setO(int x, int y) {
        if (Field.field[x][y] == 'x' | Field.field[x][y] == 'o') {
            System.out.println("This cell already set!");
            settingSuccess = false;
        } else {
            Field.field[x][y] = 'o';
            settingSuccess = true;
        }
    }

    public void cancelStep() {

    }

}
