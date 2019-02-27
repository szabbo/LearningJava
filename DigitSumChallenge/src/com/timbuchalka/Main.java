package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here

        int number = 12345;

        System.out.println("Sum of nuumber " + number + " is: " + SumDigits(number));

    }

    public static int SumDigits(int someNumber)
    {
        int sum = 0;

        if (someNumber < 10 || someNumber < 0)
            return -1;

        while (someNumber != 0)
        {
            sum += someNumber % 10;
            someNumber /= 10;
        }

        return sum;
    }
}
