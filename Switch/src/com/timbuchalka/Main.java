package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        int switchValue = 3;

        switch (switchValue)
        {
            case 1:
                System.out.println("Value was 1!");
                break;

            case 2: case 3: case 4:
                System.out.println("value was 2!");
                break;

            default:
                System.out.println("Value was 3!");
                break;
        }

        char charSwitch = 'D';

        switch (charSwitch)
        {
            case 'A':
                System.out.println("Value was A!");
                break;

            case 'B':
                System.out.println("Value was B!");
                break;

            case 'C':
                System.out.println("Value was C!");
                break;

            case 'D':
                System.out.println("Value was D!");
                break;

            case 'E':
                System.out.println("Value was E!");
                break;

            default:
                System.out.println("Value was not A, B, C, D or E!");
        }

        String stringSwitch = "NekiString";

        switch (stringSwitch.toLowerCase())
        {
            case "ovajstring":
                System.out.println("Value was 1!");
                break;

            case "onaj": case "taj": case "nekistring":
            System.out.println("value was nekiString!");
            break;

            default:
                System.out.println("Value was 3!");
                break;
        }

    }
}
