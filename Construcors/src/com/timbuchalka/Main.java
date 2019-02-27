package com.timbuchalka;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
//        BankAccount matejeJaksiceje = new BankAccount();
//        BankAccount lessPoorMatejeJaksiceje = new BankAccount("532461234", 0.00, "Mateje Jaksićeje", "lessPoorMatejeJaksiceje@goingToDrivingSchool.com", "12984375w95894");
//
//        matejeJaksiceje.withdrawFunds(100.00);
//        matejeJaksiceje.depositFunds(100.00);
//
//        lessPoorMatejeJaksiceje.depositFunds(5324.12);
//        lessPoorMatejeJaksiceje.withdrawFunds(200.00);

        VipCustomer one = new VipCustomer();
        VipCustomer two = new VipCustomer("Pero Peric", 5000.00);
        VipCustomer three = new VipCustomer("Ivo Ivic", 10000.00, "ivoIvic@ivicMail.com");

        System.out.println("No. 01 is " + one.getName() + ", " + one.getCardLimit() + ", " + one.geteMail());
        System.out.println("No. 02 is " + two.getName() + ", " + two.getCardLimit() + ", " + two.geteMail());
        System.out.println("No. 03 is " + three.getName() + ", " + three.getCardLimit() + ", " + three.geteMail());
    }
}
