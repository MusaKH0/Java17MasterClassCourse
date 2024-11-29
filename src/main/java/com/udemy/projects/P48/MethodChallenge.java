package com.udemy.projects.P48;

import com.udemy.Console;

public class MethodChallenge {

    public static void main(String[] args) {
        String name = Console.PromptForString("Player Name: ");
        int score = Console.PromptForInt("Player Score: ");

        int highScore = calculateHighScorePosition(score);
        displayHighScorePosition(name, highScore);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName
                + " managed to get into position "
                + playerPosition
                + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int result;

        if (playerScore >= 1000) {
            result = 1;
        }
        else if (playerScore >= 500) {
            result = 2;
        }
        else if (playerScore >= 100) {
            result = 3;
        }
        else {
            result = 4;
        }

        return result;
    }
}
