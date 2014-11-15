package com.tictactoe;

import java.util.Scanner;

public class Main {

    private static boolean isNextIntCorrect = false;

    private static boolean gameModeChosen = false;

    private static int gameMode;

    public static void chooseGameMode(int playersNumber) {
        if (playersNumber != 1 && playersNumber != 2) {
            System.out.println("Incorrect number! Input 1 or 2");
            gameModeChosen = false;
        } if (playersNumber == 1) {
            gameMode = 1;
            System.out.println("You'll play against computer!");
            gameModeChosen = true;
        } if (playersNumber == 2) {
            gameMode = 2;
            System.out.println("You'll play against another human!");
            gameModeChosen = true;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Field field = new Field();
        field.eraseField();

        System.out.println("Input 1 to play against computer or 2 to play against other human");
        while (gameModeChosen == false) {
            chooseGameMode(scanner.nextInt());
        }
        if (gameMode == 1) {
            System.out.println("Let's start the game! You are Player X and you go first. Input 1..3 two times (for X and Y coordinates)");
            CompPlayer playerO = new CompPlayer();
            Player playerX = new Player();
            while (FieldChecker.getWinner() == FieldChecker.defaultWinner || FieldChecker.isFieldFull() == true) {
                field.showField();
                while (playerX.settingSuccess == false) {
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    if (x > 0 && y > 0 && x < 4 && y < 4) {
                        isNextIntCorrect = true;
                    }
                    if (isNextIntCorrect == true) {
                        playerX.setX(x-1, y-1);
                   } else {
                       System.out.println("Incorrect number. Try again input 1...3");
                       playerX.settingSuccess = false;
                   }
                }
                playerX.settingSuccess = false;
                FieldChecker.checkWinner();
                FieldChecker.fieldIsFull();
                if (FieldChecker.getWinner() != FieldChecker.defaultWinner) {
                    field.showField();
                    System.out.println(FieldChecker.getWinner() + " wins!");
                    break;
                }
                playerO.CompMove();
                FieldChecker.checkWinner();
                FieldChecker.fieldIsFull();
                if (FieldChecker.getWinner() != FieldChecker.defaultWinner) {
                    field.showField();
                    System.out.println(FieldChecker.getWinner() + " wins!");
                    break;
                }
            }
        }

        if (gameMode == 2) {
            System.out.println("Let's start the game! Player X goes first. Input 1..3 two times (for X and Y coordinates)");
            Player playerO = new Player();
            Player playerX = new Player();
            while (FieldChecker.getWinner() == FieldChecker.defaultWinner || FieldChecker.isFieldFull() == true) {
                field.showField();
                while (playerX.settingSuccess == false) {
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    if (x > 0 && y > 0 && x < 4 && y < 4) {
                        isNextIntCorrect = true;
                    }
                    if (isNextIntCorrect == true) {
                        playerX.setX(x-1, y-1);
                    } else {
                        System.out.println("Incorrect number. Try again input 1...3");
                        playerX.settingSuccess = false;
                    }
                }
                playerX.settingSuccess = false;
                FieldChecker.checkWinner();
                FieldChecker.fieldIsFull();
                if (FieldChecker.getWinner() != FieldChecker.defaultWinner) {
                    field.showField();
                    System.out.println(FieldChecker.getWinner() + " wins!");
                    break;
                }
                field.showField();
                while (playerO.settingSuccess == false) {
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    if (x > 0 && y > 0 && x < 4 && y < 4) {
                        isNextIntCorrect = true;
                    }
                    if (isNextIntCorrect == true) {
                        playerO.setO(x-1, y-1);
                    } else {
                        System.out.println("Incorrect number. Try again input 1...3");
                        playerO.settingSuccess = false;
                    }
                }
                playerO.settingSuccess = false;
                FieldChecker.checkWinner();
                FieldChecker.fieldIsFull();
                if (FieldChecker.getWinner() != FieldChecker.defaultWinner) {
                    field.showField();
                    System.out.println(FieldChecker.getWinner() + " wins!");
                    break;
                }
            }
        }

    }

}

