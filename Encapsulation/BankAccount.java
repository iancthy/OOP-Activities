public class BankAccount {

    private double balance;

    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Balance can't be negative!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(double initialBalance) {
        setBalance(initialBalance);  
    }

    public void deposit(double amount) {
      if (amount > 0) {
          balance += amount;
          System.out.println("Deposited: " + amount);
      } else {
          System.out.println("Invalid deposit amount!");
       }
    }
  
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient funds!");
        }
    }
}
