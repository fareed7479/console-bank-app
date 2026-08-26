package app;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        System.out.println("Welcome to Console Bank");
        while(running) {
            System.out.println("""
                            1) Open Account
                            2) Deposit
                            3) Withdraw
                            4) Transfer
                            5) Account Details
                            6) List Accounts
                            7) Search Accounts by Customer Name
                            0) Exit
                    """);

            System.out.print("Enter Your Option : ");
            //NextLine is used to read all , until we press enter.
            String choice = sc.nextLine().trim();
            System.out.print("Selected Option : " + choice);

            switch(choice){

                //Scanner is passed to read other inputs related to related Function.
                case "1" : openAccount(sc);
                case "2" : deposit(sc);
                case "3" : withdraw(sc);
                case "4" : transfer(sc);
                case "5" : statement(sc);
                case "6" : listAccounts(sc);
                case "7" : searchAccounts(sc);
                case "0" : running = false;
            }
        }

    }

    private static void openAccount(Scanner sc) {
    }

    private static void deposit(Scanner sc) {
    }

    private static void withdraw(Scanner sc) {
    }

    private static void transfer(Scanner sc) {
    }

    private static void statement(Scanner sc) {
    }

    private static void listAccounts(Scanner sc) {
    }

    private static void searchAccounts(Scanner sc) {
    }
}