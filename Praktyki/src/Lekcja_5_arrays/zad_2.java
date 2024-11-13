package Lekcja_5_arrays;

import java.util.Scanner;

public class zad_2 {
    Scanner sc = new Scanner(System.in);

    String[] studentList = new String[5];
    public void printArr(){
        for(int i = 0; i < studentList.length; i++){
            System.out.println(studentList[i]);
        }
        System.out.println("\n");
    }

    public void deleteFromArr(int id){
        studentList[id] = "----";
    }

    public static void main(String[] args) {
        zad_2 a = new zad_2();
        a.studentList = new String[]{"Jan","Andrzej","Karol","Jakub","Adam"};
        a.printArr();
        a.deleteFromArr(3);
        a.studentList[1] = "Tomasz";
        a.studentList[2] = "Bartosz";
        a.printArr();
    }
}
