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
                            6) Search Accounts by Customer Name
                            7) List Accounts
                            0) Exit
                    """);

            System.out.print("Enter Your Option : ");
            //NextLine is used to read all , until we press enter.
            String choice = sc.nextLine().trim();
            System.out.print("Selected Option : " + choice);

            switch(choice){
                case "0" : running = false;
            }
        }

    }
}