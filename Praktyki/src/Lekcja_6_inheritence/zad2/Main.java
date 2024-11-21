package Lekcja_6_inheritence.zad2;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1, 1000,"Jan Kowalski");
        account.deposit(2000);
        System.out.println(account.getBalance());
        account.withdraw(3000);
        System.out.println(account.getBalance());
        account.withdraw(5000);
        System.out.println(account.getBalance());



    }
}
