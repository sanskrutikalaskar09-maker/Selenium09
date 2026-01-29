package assessment_21;
 
class BankAccount {
 private double balance;

 BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }
 
 public void deposit(double amount) {
     balance = amount;
     System.out.println("Deposite: " + amount);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance = amount;
         System.out.println("Withdraw: " + amount);
     } else {
         System.out.println("Insufficient balance");
     }
 }
 public double getBalance() {
     return balance;
 }
}
class SavingAccount extends BankAccount {
 SavingAccount(double initialBalance) {
     super(initialBalance);
 }
}

class CurrentAccount extends BankAccount {
 CurrentAccount(double initialBalance) {
     super(initialBalance);
 }
}
public class bankaccount1{
 public static void main(String[] args) {
     
     SavingAccount sa = new SavingAccount(1000);
     sa.deposit(500);
     sa.withdraw(200);
     System.out.println("Saving Account Balance: " + sa.getBalance());

     CurrentAccount ca = new CurrentAccount(2000);
     ca.deposit(1000);
     ca.withdraw(2500);
     System.out.println("Current Account Balance: " + ca.getBalance());
 }
}