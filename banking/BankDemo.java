package banking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankDemo {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Account account = new Account("1234","John", 1000);

        while(true) {
          System.out.println("\n Bank Menu");
          System.out.println("1 Deposit");
          System.out.println("2 Withdraw");
          System.out.println("3 Show Balance");
          System.out.println("4 Exit");
          System.out.print("Enter your choice");

         int choice = 0;
        try
        {
             choice = scanner.nextInt();
            }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input! Please enter a number.");
            scanner.nextLine();
            continue;
            }

            switch(choice)
            {
        case 1:
        System.out.print("Enter deposit amount:");
        try
        {
        double amount = scanner.nextDouble();
        account.deposit(amount);
              }
        catch(InputMismatchException e)
        {
        System.out.println("Invalid amount Please enter a number");
            scanner.nextLine();
            }
        break;

        case 2:
        System.out.print("Enter withdrawal amount:");
        try
        {
        double amount = scanner.nextDouble();
        account.withdraw(amount);
                    }
        catch(InputMismatchException e)
        {
        System.out.println("Invalid amount Please enter a number");
        scanner.nextLine();
                    }
        catch(ArithmeticException | InsufficientBalanceException e)
        {
        System.out.println(e.getMessage());
        }
        break;

        case 3:
        account.showBalance();
        break;
        
        case 4:
        System.out.println("Exiting Thank you");
        scanner.close();
        System.exit(0);
        break;

                default:
                    System.out.println("Invalid choice Please select 1-4");
                }
             }  
                }
}
