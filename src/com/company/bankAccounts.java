package com.company;

public class bankAccounts {

    //Declare instance variables
    public double balance;
    public String name;

    public bankAccounts (double b,
                         String n)
    {
        balance = b;
        name = n;
    }

    public void deposit(double d)
    {
        balance = balance + d;
    }

    public void withdraw(double w)
    {
        balance = balance - w;
    }
}
