package com.company;

import java.util.Scanner;

public class GuessTheWord {

    private boolean play = true;
    private Words w = new Words();
    private Scanner input = new Scanner(System.in);
    private int rounds = 10;
    private char lastRound;

    public void start() {

        do {
            showWord();
            getInput();
            checkInput();
        } while(play);
    }

    void showWord() {
        System.out.println("You have a " + rounds + " tries left.");
        System.out.println(w);
    }
    void getInput() {
        System.out.println("Enter a letter to guess a word : ");
        String str = input.nextLine();
        lastRound = str.charAt(0);

    }
    void checkInput() {
        boolean isGuessedRight =  w.guess(lastRound);

        if (isGuessedRight) {
            if (w.isGuessedRight()) {
                System.out.println("Congrats, You won!");
                System.out.println("The word is : " + w);
                play = false;
            }
        }
        else {
            rounds--;
            if (rounds == 0) {
                System.out.println("Game Over!");
                play = false;
            }
        }
    }

    public void end() {
        input.close();
    }
}
