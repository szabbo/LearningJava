package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        double amount = 10000;

        for (int i = 8; i > 0; i--)
        {
            if (i >= 2)
            {
                System.out.println(String.format("%.2f", CalculateIntrest(amount, i)));
            }
        }

        PrimeNumberCounter(10, 50);
    }

    public static double CalculateIntrest(double amount, double intrestRate)
    {
        return (amount * (intrestRate / 100));
    }

    public static boolean IsPrime(int someNumber)
    {
        if (someNumber == 1)
            return false;

        for (int i = 2; i <= (long) Math.sqrt(someNumber); i++)
        {
            if (someNumber % i == 0)
                return false;
        }

        return true;
    }

    public static void PrimeNumberCounter(int min, int max)
    {
        int count = 0;

        for (int i = min; i < max; i++)
        {
            if (i > 0)
            {
                if (IsPrime(i))
                {
                    System.out.println("Number " + i + " is a prime number!");
                    count++;
                }

                if (count == 10)
                    break;
            }
        }
    }
}
