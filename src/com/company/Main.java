package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bankAccounts myAccount =
                new bankAccounts(
                        1000,
                        "Sally Jones"
                );
        myAccount.deposit(505.22);
        System.out.println(myAccount.balance);
        myAccount.withdraw(100);
        System.out.println("The Sally Jones account balance is, " + myAccount.balance);
    }
}
