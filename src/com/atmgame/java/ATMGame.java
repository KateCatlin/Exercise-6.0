package com.atmgame.java;

/**
 * Created by katecatlin on 9/11/14.
 */
import java.util.Scanner;

import java.util.InputMismatchException;



public class ATMGame {

    static int yourChoice = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yesOrNo = 1;
        do {
            yourChoice = openingStatement();
            doSwitch();
            doCheckForMore();
        }
        while (yesOrNo == 1) ;
    }

static public int openingStatement () {
    Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Kate Bank, where everyone is friendly! What would you like to do?");
        System.out.println("(Enter a number to select an option)");
        System.out.println();
        System.out.println("1: Check Account Balance");
        System.out.println("2: Withdraw Funds");
    System.out.println("3: Deposit Funds");
    System.out.println("4: Hear a funny joke.");
    int yourChoice = in.nextInt();
    return yourChoice;
        }

static public void doDeposit () {
    Scanner in = new Scanner(System.in);
    System.out.println("\nHow much would you like to withdraw? Enter the number with NO $ sign or commas!");

    try {double myWithdraw = in.nextDouble();
        System.out.println("You have withdrawn $" + myWithdraw + "0.");}
    catch (InputMismatchException exception) {
        System.out.println("This is not an integer. You have broken the ATM. Start over.");
    }
    }

static public void doBalance() {
    System.out.println("\nYour account balance is $1,000,000. Surprise!");
}

    static public void doWithdrawl() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nHow much would you like to withdraw? Enter the number with NO $ sign or commas!");
        try {double myDeposit = in.nextDouble();
            System.out.println("You have withdrawn $" + myDeposit + "0.");}
        catch (InputMismatchException exception) {
            System.out.println("This is not an integer. You have broken the ATM. Start over.");
        }
    }

    static public void doJoke() {
        System.out.println("\nA horse walks into a bar. The bartender says: 'Hey buddy, why the long face?' HAHAHAHA.");
    }

    static public void doSwitch() {
        switch (yourChoice) {
            case 1:
                doBalance ();
                break;
            case 2:
                doDeposit();
                break;
            case 3:
                doWithdrawl();
                break;
            case 4:
                doJoke();
                break;
            default:
                System.out.println("\nSorry, that's not an option! Try again!");
        }
    }

    static public int doCheckForMore() {
        int yesOrNo = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("\n Would you like to complete other transactions today? If so, press 1! ");
        yesOrNo = in.nextInt();
    return yesOrNo;
    }

}
