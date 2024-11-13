package Lekcja_4.StudentManagementSystem;

class Student {
    private String name;
    public int age;
    private int[] grade;
    private double avgGrade;

    Student(String name, int age, int[] grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrade() {
        return grade;
    }

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }


    void introduce() {
        System.out.println("----------------------");
        System.out.println("Name : " + getName());
        System.out.println("Age : " + age);
        System.out.println("Grades : ");
        for (int i = 0; i < getGrade().length; i++) {
            System.out.println(getGrade()[i]);
        }
    }

    void calculateFinalGrade() {
        for (int i = 0; i < getGrade().length; i++) {
            setAvgGrade(getAvgGrade() + getGrade()[i]);
        }
        setAvgGrade(getAvgGrade() / getGrade().length);
        System.out.println("\nOcena końcowa: " + getAvgGrade());

        if (getAvgGrade() < 4) {
            System.out.println("Ocena wymaga poprawy!");
        } else if (getAvgGrade() >= 4.0 && getAvgGrade() < 5.0) {
            System.out.println("Dobrze!");
        } else if (getAvgGrade() >= 5.0) {
            System.out.println("Wspaniale!");
        }
        System.out.println("----------------------");
    }
}
