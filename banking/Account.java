package banking;

public class Account{
   private String accountNo;
   private String name;
   private double balance;

    public Account(String accountNo,String name,double balance)
    {
       this.accountNo = accountNo;
       this.name = name;
       this.balance = balance;
  }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
         balance += amount;
            System.out.println("Deposited"+ amount);
       }
        else
        {
            System.out.println("Amount must be positive");
       }
    }

         public void withdraw(double amount)
         throws InsufficientBalanceException,ArithmeticException
    {
        if(amount < 0)
        {
           throw new ArithmeticException("Withdrawal amount cannot be negative");
        }
        if(amount > balance)
        {
           throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
       System.out.println("Withdrawn" + amount);
       }

    public void showBalance()
    {
       System.out.println("Current balance"+ balance);
    }
}
