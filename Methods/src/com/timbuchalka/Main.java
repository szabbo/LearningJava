package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here

        boolean gameOver = true;
        int score = 1000;
        int compleatedLevel = 6;
        int bonus = 100;

//        int highScore = CalculateScore(gameOver, score, compleatedLevel, bonus);
//        System.out.println("Your score is: " + highScore);
//
//        highScore = CalculateScore(true, 2000, 7, 150);
//        System.out.println("Your score is: " + highScore);

        DisplayHighScorePosition("A", CalculateHighScorePosition(1500));
        DisplayHighScorePosition("B", CalculateHighScorePosition(900));
        DisplayHighScorePosition("C", CalculateHighScorePosition(400));
        DisplayHighScorePosition("D", CalculateHighScorePosition(50));
    }

//    public static int CalculateScore(boolean isGameOver, int score, int levelCompleated, int bonusMulti)
//    {
//        if (isGameOver)
//        {
//            int finalScore = score + (levelCompleated * bonusMulti);
//
//            return finalScore;
//        }
//
//        return -1;
//    }

    public static void DisplayHighScorePosition(String playerName, int positionInTable)
    {
        System.out.println(playerName + " managed to get into position " + positionInTable + " on the high score table");
    }

    public static int CalculateHighScorePosition(int playerScore)
    {
        if (playerScore >= 1000)
            return 1;
        else if (playerScore >= 500)
            return 2;
        else if (playerScore >= 100)
            return 3;
        else
            return 4;
    }
}
