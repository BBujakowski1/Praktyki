package Lekcja_4.zad_2;

class Book{
    String title;
    String author;
    int yearPublished;

    Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    void displayDetails(){
        System.out.println("Tytuł: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Rok wydania: " + yearPublished);
    }
}

public class zad_2 {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter i Komnata Tajemnic","J. K. Rowling",1998);
        book.displayDetails();
    }
}
