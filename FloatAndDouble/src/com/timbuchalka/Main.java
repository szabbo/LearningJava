package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here

        //32 = 4 bytes
        int myIntValue = 5 / 3;
        //32 = 4 bytes
        float myFloatValue = 5f / 3f;
        //64 = 8 bytes
        double myDoubleValue = 5d / 3d;

        System.out.println("My int value is: " + myIntValue);
        System.out.println("My float value is: " + myFloatValue);
        System.out.println("My double value is: " + myDoubleValue);

        double nbrOfPounds = 132.6d;
        double convertionIndex = 0.45359237d;
        double nbrOfKgs = nbrOfPounds * convertionIndex;

        System.out.print("Number of kilograms is: " + nbrOfKgs);
    }
}
