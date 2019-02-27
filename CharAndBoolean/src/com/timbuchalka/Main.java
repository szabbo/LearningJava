package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here

        char myChar = '\u00AE';
        boolean myBool = true;

        if (myBool == false)
            System.out.println("You fucked up smthing");
        else
            System.out.println("Unicode output is: " + myChar);
    }
}
