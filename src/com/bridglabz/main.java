package com.bridglabz;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account account1 = new Account("om", "S5891", 1000);
        Account account2 = new Account("shree", "Si8876", 2000);
        Account account3 = new Account("Anu", "S7222", 30000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList< Account > accounts = bank.getAccounts();

        for (Account account: accounts) {
            System.out.println(account.getAccountInfo());
        }

        System.out.println("\nAfter depositing 1000 into account1:");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.getAccountInfo());
        System.out.println("No transaction in account2:");
        System.out.println(account2.getAccountInfo());
        System.out.println("After withdrawing 5000 from account3:");
        bank.withdrawMoney(account3, 5000);
        System.out.println(account3.getAccountInfo());
    }
}


