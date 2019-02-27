package com.timbuchalka;

public class VipCustomer
{
    //varijable
    private String name;
    private double cardLimit;
    private String eMail;

    //constructori
    public VipCustomer()
    {
        this("Unknown Somebody", 5200.00, "iDontHaveMail@UnknownSomebody.com");
        System.out.println("Default constructor");
    }

    public VipCustomer(String name, double cardLimit)
    {
        this(name, cardLimit, "iDontHaveMail@UnknownSomebody.com");
//        this.name = name;
//        this.cardLimit = cardLimit;
//        this.eMail = "iDontHaveMail@UnknownSomebody.com";
        System.out.println("Semi-default constructor");
    }

    public VipCustomer(String name, double cardLimit, String eMail)
    {
        this.name = name;
        this.cardLimit = cardLimit;
        this.eMail = eMail;
        System.out.println("Constructor");
    }

    //seteri

    //getteri

    public String getName()
    {
        return name;
    }

    public double getCardLimit()
    {
        return cardLimit;
    }

    public String geteMail()
    {
        return eMail;
    }
}
