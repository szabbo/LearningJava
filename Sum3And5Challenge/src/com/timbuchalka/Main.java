package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        int count = 0, sum = 0;

        for (int i = 1; i < 1000; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("Number " + i + " has met the condition!");

                sum += i;
                count++;

                if (count == 5)
                {
                    System.out.println("The sum of those numbers is " + sum);
                    break;
                }
            }
        }
    }
}
