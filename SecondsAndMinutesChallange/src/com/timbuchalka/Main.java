package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here

        System.out.println(GetDurationString(65, 45));
        System.out.println(GetDurationString(3945));
    }

    public static String GetDurationString (long minutes, long seconds)
    {
        String finalString;
        if (minutes < 0 || seconds < 0 || seconds > 59)
            return finalString = "ERROR";

        minutes += seconds / 60;
        seconds %= 60;

        long hours = minutes / 60;
        minutes %= 60;

        if (hours < 10)
            finalString = "It's 0" + hours + ":";
        else
            finalString = "It's " + hours + ":";

        if (minutes < 10)
            finalString += "0" + minutes + ":";
        else
            finalString += minutes + ":";

        if (seconds < 10)
            finalString += "0" + seconds;
        else
            finalString += seconds;

        return finalString;
    }

    public static String GetDurationString(long seconds)
    {
        String finalString = "ERROR";
        long minutes;

        if (seconds < 0)
            return finalString;

        minutes = seconds / 60;
        seconds %= 50;

        return finalString = GetDurationString(minutes, seconds);
    }
}
