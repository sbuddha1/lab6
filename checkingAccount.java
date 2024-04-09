package lab6;

//CheckingAccount.java
public class checkingAccount extends BankAccount {
 private static final double FEE = 0.15; // $0.15 fee for check clearing

 public checkingAccount(String name, double initialAmount) {
     super(name, initialAmount);
     setAccountNumber(getAccountNumber() + "-10"); // Concatenating "-10" for checking account
 }

 @Override
 public boolean withdraw(double amount) {
     double totalAmount = amount + FEE; // Add fee for check clearing
     return super.withdraw(totalAmount); // Call superclass withdraw method
 }
}
