package Lekcja_4.StudentManagementSystem;

public class StudentManagementSystem {
    public static void main(String[] args) {
        School school = new School();

        school.Students[0] = new Student("Jan",19, new int[]{5, 5, 3});
        school.Students[1] = new Student("Andrzej",17, new int[]{2, 4, 3});
        school.Students[2] = new Student("Karol",18, new int[]{4, 6, 5});
        school.Students[3] = School.addStudent();

        for (int i = 0; i < (school.Students.length - 1); i++){
            school.Students[i].introduce();
            school.Students[i].calculateFinalGrade();
        }


    }
}
