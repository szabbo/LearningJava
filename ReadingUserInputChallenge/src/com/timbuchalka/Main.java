package com.timbuchalka;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        int sum = 0, counter = 0, nmbrOrder = 0;
        boolean hasNextInt;
        Scanner scanner = new Scanner(System.in);

        while (counter != 10)
        {
            nmbrOrder = counter + 1;
            System.out.println("Enter #" + nmbrOrder + ":");
            hasNextInt = scanner.hasNextInt();

            if (hasNextInt)
            {
                sum += scanner.nextInt();
                counter++;
            }
            else
                System.out.println("You have entered invalid number!");

            scanner.nextLine();
        }

        System.out.println("Sum is equal to " + sum);

        scanner.close();
    }
}
