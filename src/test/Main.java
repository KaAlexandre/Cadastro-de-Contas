package test;

import domain.Account;
import domain.Owner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter account name: ");
        Owner owner = new Owner(scanner.nextLine());

        double totalValue = 0;
        Account account = new Account(accountNumber,owner,totalValue);

        System.out.println("Is there a initial deposite (Y/N)?");
        String response = scanner.nextLine();
        do {
            if (response.equals("Y") || response.equals("y")) {
                System.out.println("Enter initial deposit account");
                double amountValue = scanner.nextDouble();
                account.deposit(amountValue);
                account.print();
                break;
            } else if (response.equals("n") || response.equals("N")) {
                break;
            }
        } while (true);
        boolean verify = true;
        do {
            System.out.println("do you wish make a deposit(1), a withdrawal(2) or exit from the program(3)?");
            int options = scanner.nextInt();
            scanner.nextLine();

            switch (options) {
                case 1:
                    System.out.println("Enter deposit account");
                    double amountValue = scanner.nextDouble();
                    account.deposit(amountValue);
                    System.out.println("Updated account data: ");
                    account.print();
                    break;
                case 2:
                    System.out.println("Enter withdrawal value ");
                    double withdrawalValue = scanner.nextDouble();
                    account.withdrawal(withdrawalValue);
                    System.out.println("Updated account data: ");
                    account.print();
                    break;
                case 3:
                    verify = false;
                    break;
            }
        } while (verify);

    }
}