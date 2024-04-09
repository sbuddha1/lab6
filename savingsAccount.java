package lab6;

//SavingsAccount.java
public class savingsAccount extends BankAccount {
 private double rate = 0.025; // 2.5% interest rate
 private static int savingsNumber = 0; // For identifying individual savings accounts
 private int mySavingsNumber; // Specific savings account number

 public savingsAccount(String name, double initialBalance) {
     super(name, initialBalance);
     mySavingsNumber = savingsNumber++; // Increment and assign the savingsNumber
     setAccountNumber(getAccountNumber() + "-" + mySavingsNumber);
 }

 public void postInterest() {
     double interest = getBalance() * rate / 12; // Calculate monthly interest
     deposit(interest); // Deposit the interest
 }

 @Override
 public String getAccountNumber() {
     return super.getAccountNumber() + "-" + mySavingsNumber;
 }

 // Copy constructor
 public savingsAccount(savingsAccount originalAccount, double initialBalance) {
     super(originalAccount, initialBalance);
     mySavingsNumber = savingsNumber++; // Increment and assign the savingsNumber
     setAccountNumber(getAccountNumber() + "-" + mySavingsNumber);
 }
}
