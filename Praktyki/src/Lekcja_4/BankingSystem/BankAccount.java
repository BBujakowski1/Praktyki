package Lekcja_4.BankingSystem;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolder;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {
        if (getBalance() < amount) {
            System.out.println("Za mało środków");
        } else {
            setBalance(getBalance() - amount);
            warning();
        }
    }

    public void warning(){
        if (getBalance() <= 100){
            System.out.println("Niskie saldo konta!");
        }
    }

    void displayBalance() {
        System.out.println("Saldo: " + getBalance());
    }
}
