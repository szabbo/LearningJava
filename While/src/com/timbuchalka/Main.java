package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
//        do loop sa for-om
//        for (;;)
//        {
//            System.out.println("do-loop");
//        }

        int startNumber = 4, finishNumber  = 20, nmbrOfEven = 0;

        while (startNumber <= finishNumber)
        {
            startNumber++;
            //System.out.println("startNumber: " + startNumber);
            if (!IsEvenNumber(startNumber))
            {
                continue;
            }

            nmbrOfEven++;
            //System.out.println(nmbrOfEven);

            System.out.println("Number " + startNumber + " is even number!");

            if (nmbrOfEven == 5)
                break;

        }

        System.out.println("Total number of even numbers is: " + nmbrOfEven);

    }

    public static boolean IsEvenNumber(int someNumber)
    {
        if (someNumber % 2 == 0)
            return true;

        return false;
    }
}
