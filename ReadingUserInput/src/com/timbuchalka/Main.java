package com.timbuchalka;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name = newScanner.nextLine();


        System.out.println("Enter year of your birth: ");

        //provjerava je li sljedece stp zelimo unjeti integer
        boolean hasNextInt = newScanner.hasNextInt();

        if (hasNextInt)
        {
            int yearOfBirth = newScanner.nextInt();
            newScanner.nextLine(); //sprijecava pizdarije prilikom pritiska entera nakon unosenja broja

            System.out.println("Your name is " + name);
            System.out.println("and you are " + (2018 - yearOfBirth) + " years old.");
        }

        newScanner.close();
    }
}
