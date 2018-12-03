package main.java.human;

public class Student extends Human {
    boolean isActiveStudentId;
    public Student(String firstName, String lastName, int age, boolean isActiveStudentId) {
        super(firstName, lastName, age);
        this.isActiveStudentId = isActiveStudentId;
    }

}
