package Lekcja_4.BankingSystem;

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1",7000.0,"Jan");
        account1.withdraw(5000);
        account1.deposit(2000);
        account1.withdraw(10000);
        account1.displayBalance();

    }
}
