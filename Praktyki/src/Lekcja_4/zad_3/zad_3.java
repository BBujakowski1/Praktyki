package Lekcja_4.zad_3;

class car{
    String brand;
    String model;
    String color;
    int year;

    car(String brand, String model, String color, int year){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    void checkBrand(){
        System.out.println("Marka auta: " + brand);
    }
    void checkModel(){
        System.out.println("Model auta: " + model);
    }
    void checkColor(){
        System.out.println("Kolor auta: " + color);
    }
    void checkYear(){
        System.out.println("Rok wydania: " + year);
    }

    void chceckAll(){
        checkBrand();
        checkModel();
        checkColor();
        checkYear();
        System.out.println("--------------");
    }

}

public class zad_3 {
    public static void main(String[] args) {
        car c1 = new car("BMW","E36","Czarny",1991);
        car c2 = new car("Subaru ","Impreza","Niebieski",1993);
        c1.chceckAll();
        c2.checkBrand();
        c2.checkModel();
        c2.checkColor();

    }
}
