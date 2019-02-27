package com.timbuchalka;

public class BankAccount
{
    //variable
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private String pin;

    //construktori
    public BankAccount()
    {
        this("nekiBroj", 0.00, "Certain Someone", "iDontHaveEmail@noEmail.com", "iDontHavePhone");
        System.out.println("Default constructor.");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //seteri
    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName  = customerName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    //geteri
    public String getAccountNumber()
    {
        return this.accountNumber;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public String getCustomerName()
    {
        return this.customerName;
    }

    public String getEmail()
    {
        return this.email;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    //metode
    public void depositFunds(double funds)
    {
        if (funds == 100.00)
            System.out.println("You still don't have money.");
        else
        {
            this.balance += funds;
            System.out.println("New balance is: " + this.balance);
        }
    }

    public void withdrawFunds(double funds)
    {
        if (this.balance == 0)
            System.out.println("Mateje you are poor and you don't have money!!!");
        else if (funds <= this.balance)
        {
            this.balance -= funds;
            System.out.println("New balance is: " + this.balance);
        }
        else
            System.out.println("You can only withdraw " + this.balance);
    }

    public boolean IsUser(String pin, String accountNumber)
    {
        if (pin == this.pin && accountNumber == this.accountNumber)
            return true;
        else
            return false;
    }
}
