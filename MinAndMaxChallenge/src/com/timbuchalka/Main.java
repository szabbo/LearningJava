package com.timbuchalka;

import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        MinAndMaxNumber();
    }

    public static void MinAndMaxNumber()
    {
        int minNumber = 0, maxNumber = 0, tmp;
        boolean isFirst = true, hasNextInt = true;
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            if (isFirst)
            {
                System.out.println("Enter number: ");
                hasNextInt = scanner.hasNextInt();

                if (hasNextInt)
                {
                    minNumber = scanner.nextInt();
                    scanner.nextLine();
                }
                else
                    break;

                System.out.println("Enter number: ");
                hasNextInt = scanner.hasNextInt();

                if (hasNextInt)
                {
                    maxNumber = scanner.nextInt();
                    scanner.nextLine();
                }
                else
                    break;

                if (minNumber > maxNumber)
                {
                    tmp = minNumber;
                    minNumber = maxNumber;
                    maxNumber = tmp;
                }

                isFirst = false;
            }
            else if (!isFirst)
            {
                System.out.println("Enter number: ");
                hasNextInt = scanner.hasNextInt();

                if (hasNextInt)
                {
                    tmp = scanner.nextInt();
                    scanner.nextLine();
                }
                else
                    break;

                if (tmp >= maxNumber)
                    maxNumber = tmp;

                else if (tmp <= minNumber)
                    minNumber = tmp;
            }
        }

        System.out.println("Min: " + minNumber + " Max: " + maxNumber);
        scanner.close();
    }
}
