package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        int day = 3;

        PrintDayOfTheWeek(day);
    }

    public static void PrintDayOfTheWeek(int someDay)
    {
        switch (someDay)
        {
            case 0:
                System.out.println("Today is Sunday!");
                break;

            case 1:
                System.out.println("Today is Monday!");
                break;

            case 2:
                System.out.println("Today is Thusday!");
                break;

            case 3:
                System.out.println("Today is Wednesday!");
                break;

            case 4:
                System.out.println("Today is Thursday!");
                break;

            case 5:
                System.out.println("Today is Friday!");
                break;

            case 6:
                System.out.println("Today is Saturday!");
                break;

            default:
                System.out.println("You have enterd invalid number!");
            break;
        }
    }
}
