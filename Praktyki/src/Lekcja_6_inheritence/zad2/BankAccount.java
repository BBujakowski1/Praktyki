package Lekcja_6_inheritence.zad2;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accoundHolderName;

    public BankAccount(int accountNumber, double balance, String accoundHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accoundHolderName = accoundHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccoundHolderName() {
        return accoundHolderName;
    }

    public void setAccoundHolderName(String accoundHolderName) {
        this.accoundHolderName = accoundHolderName;
    }


    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        if ((this.balance - amount) < 0) {
            System.out.println("za mało balansu");
        }
        else{
            this.balance -= amount;
        }
    }

    public void displayAccountBalance() {
        System.out.println(this.accoundHolderName + " posiada: " + this.balance +" zł");
    }
}
