package Lekcja_4.zad_1;

class Person {
    String name;
    int age;

    void introduce() {
        System.out.println(name + " ma " + age + " lat.");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
