package Lekcja_4.StudentManagementSystem;

import java.util.Scanner;

class School {
    Student[] Students = new Student[30];

    public static Student addStudent() {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Dodawanie Studenta:\n");
        System.out.println("Podaj imie : ");
        name = sc.nextLine();
        System.out.println("Podaj wiek : ");
        age = sc.nextInt();
        System.out.println("Podaj ile student ma mieć ocen : ");
        int iloscOcen = sc.nextInt();
        int[] grade = new int[iloscOcen];
        for (int i = 0; i < iloscOcen; i++) {
            System.out.println("Podaj " + (i + 1) + " ocene: ");
            grade[i] = sc.nextInt();
        }
        Student student = new Student(name, age, grade);
        return student;
    }
}
