package com.company;

import java.util.Random;
import java.util.Scanner;

public class Words {

    private String[] words = {"Barcelona", "Madrid", "Rome", "Napoli", "Milan", "Man United" , "Man City",
            "Liverpool", "Tottenham", "PSG", "Dortumnd", "Chelsea, Inter, Juventus"};

    private String selectedWord;
    private Random r = new Random();
    private char[] letters;

    public Words() {
        selectedWord = words[r.nextInt(words.length)];
        letters = new char[selectedWord.length()];
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (char letter : letters) {
            sb.append(letter == '\u0000' ? "-" : letter);
            sb.append(" ");
        }
        return sb.toString();
    }

    public boolean isGuessedRight() {
        for (char l : letters) {
            if (l == '\u0000') {
                return false;
            }
        }
        return true;
    }

    public boolean guess(char letter) {

        boolean guessedRight = false;
        for (int i = 0; i < selectedWord.length(); i++) {
            if (letter == selectedWord.charAt(i)) {
                letters[i] = letter;
                guessedRight = true;
            }
        }
        return guessedRight;
    }
}
