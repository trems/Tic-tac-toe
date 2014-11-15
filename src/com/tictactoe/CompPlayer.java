package com.tictactoe;

/**
 * Created by MIKE on 14.11.2014.
 */
public class CompPlayer {

    //Нагло украден с просторов интернета потому что я тупой
    public void CompMove() {
        int x = (int) (Math.random() * 3), y = (int) (Math.random() * 3);
        while (Field.field[x][y] == 'x' || Field.field[x][y] == 'o') {
            x = (int) (Math.random() * 3);
            y = (int) (Math.random() * 3);
        }
        Field.field[x][y] = 'o';
    }

}
