package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        System.out.println(CalculateFeetAndInchesToCentimeters(7, 5));
        System.out.println(CalculateFeetAndInchesToCentimeters(100));
    }

    public static double CalculateFeetAndInchesToCentimeters(double feets, double inches)
    {
        double help = 0;

        if (feets >= 0 && inches >= 0 && inches <= 12)
        {
            help = feets * 12;
            inches += help;

            return inches * 2.54;
        }

        return -1;
    }

    public static double CalculateFeetAndInchesToCentimeters(double inches)
    {
        double help = 0;

        if (inches >= 0)
        {
            help = (int)inches / 12;

            return CalculateFeetAndInchesToCentimeters(help, (int)inches % 12);
        }

        return -1;
    }
}
