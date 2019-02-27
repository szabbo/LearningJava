package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here

        String numberAsString = "2.012546348";
        System.out.println("numberAsString = " + numberAsString);

        double parsedNumber = Double.parseDouble(numberAsString);
        System.out.println("parsedNumber = " + parsedNumber);

        numberAsString += 1;
        System.out.println("numberAsString = " + numberAsString);

        parsedNumber += 1;
        System.out.println("parsedNumber = " + parsedNumber);
    }
}
