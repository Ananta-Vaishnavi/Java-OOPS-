// Program that creates a class Account that stores a variable balance. The class has methods
// to start account, to deposit money, to withdraw money and tell the current balance
// amount
import java.util.*;
class Account {
    double balance;
    public Account(double intialAmount) {
        balance = intialAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

}    
class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial amount deposted");
        double intialAmount = sc.nextDouble();
        Account account = new Account(intialAmount);

        System.out.println("Enter the amount deposted");
        double amount = sc.nextDouble();
        account.deposit(amount);

        System.out.println("Enter the amount withdrawn");
        amount = sc.nextDouble();
        account.withdraw(amount);
        
        System.out.println("Current balance: " + account.getBalance());
    
}
}
