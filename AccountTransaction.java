package BankingApplication;

import java.util.Scanner;

public class AccountTransaction {
    Scanner scan = new Scanner(System.in);
    public void accountTransaction(AccountInfo key) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("                Welcome " + key.getCustomerName());
        System.out.println("---------------------------------------------------------------");
        int loop;
        do {
            System.out.println("Press 1 for Deposit");
            System.out.println("Press 2 for Withdraw");
            System.out.println("Press 3 for Check Balance");
            System.out.println("Press 4 for Exit");
            System.out.println("---------------------------------------------------------------");
            System.out.print("Enter : ");
            loop = scan.nextInt();
            switch (loop) {
                case 1:
                    System.out.println("Current Balance : " + key.getBalance());
                    System.out.print("Enter the amount : ");
                    int amount = scan.nextInt();
                    key.setBalance(key.getBalance() + amount);
                    System.out.println("\nYour Money has been successfully deposited");
                    System.out.println("Now Balance : " + key.getBalance());
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Current Balance : " + key.getBalance());
                    System.out.print("Enter the amount : ");
                    amount = scan.nextInt();
                    if (amount < key.getBalance()) key.setBalance(key.getBalance() - amount);
                    else {
                        System.err.println("\"Insufficient Balance\"\n");
                        break;
                    }
                    System.out.println("Please collect your money");
                    System.out.println("\nAmount withdraw Successfully");
                    System.out.println("Now Balance : " + key.getBalance());
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Account Number : " + key.getCustomerAccountNo());
                    System.out.println("Name : " + key.getCustomerName());
                    System.out.println("Balance : " + key.getBalance());
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 4:
                    break;
                default:
                    System.err.println("Please give the valid option");
            }
        } while (loop != 4);

    }
}
