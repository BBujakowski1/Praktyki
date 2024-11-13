package Lekcja_5_arrays;

public class zad_1 {
    int[] arr = new int[5];
    int sum;

    public void printArr(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public void sumArr(){
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Suma: " + sum);
    }

    public void modifyArr(){
        arr[2] = 10;
        printArr();
    }

    public static void main(String[] args) {
        zad_1 a = new zad_1();
        a.arr = new int[]{1, 2, 3, 4, 5};
        a.printArr();
        a.sumArr();
        a.modifyArr();
        a.sumArr();

    }
}
