package com.abhisheksingh.junit;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount("Evgenia", "OG", 1500, BankAccount.CHECKING);
        System.out.println("Running a test.....");
    }

    @org.junit.Test
    public void deposit()  {
        double balance = account.deposit(500, true);
        assertEquals(2000, balance, 0);
        assertEquals(2000, account.getBalance(), 0);
    }

    @org.junit.Test
    public void withdraw_branch() {
        double balance = account.withdraw(500,true);
        assertEquals(1000,balance,0);
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() {
        double balance = account.withdraw(1100,false);
        assertEquals(400,balance,0);
    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(500, true);
        assertEquals(2000, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdraw(500, true);
        assertEquals(1000, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        assertTrue("This account is NOT  a Checking Account ", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @org.junit.After
    public void teardown() {
        System.out.println("Count =" + count++);
    }

}