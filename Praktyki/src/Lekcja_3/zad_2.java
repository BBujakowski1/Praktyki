package Lekcja_3;

public class zad_2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = a+b;
        for (int z=0;z < 10;z++) {
            System.out.println(sum);
            a=b;
            b = sum;
            sum = a+b;
        }
    }
}
