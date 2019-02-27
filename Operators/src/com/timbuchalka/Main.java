package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here

        boolean isAlive = false;

        if (isAlive)
            System.out.println("He is alive!");
        else if (!isAlive)
            System.out.println("He is dead!");

        double firstNumber = 20, secondNumber = 80, result = 0;

        result = (25 * (firstNumber + secondNumber)) % 40;

        System.out.println("My result is: " + result);

        if (result <= 20)
        {
            System.out.println("Total was over the limit!");
        }
    }
}
