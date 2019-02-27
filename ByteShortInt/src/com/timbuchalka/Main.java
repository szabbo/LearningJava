package com.timbuchalka;

public class Main
{

    public static void main(String[] args) {
        // write your code here

        //sve osim inta i longa treba castati byte value = (byte) (otherValue / 2);

        //32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        //8
        byte myByteValue = -128;
        byte myMaxByteValue = 127;

        //16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;

        //64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;

        int myInt = 50;
        byte myByte = 10;
        short myShort = 20;

        long myLong = 50000 + 10 * (myByte + myInt + myShort);

        System.out.println("Long Total: " + myLong);
    }
}
