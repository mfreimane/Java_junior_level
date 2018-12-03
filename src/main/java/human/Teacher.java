package main.java.human;

public class Teacher extends Human {

    private double salary;



    public Teacher(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;

    }

    public String getSalary() {
        return String.valueOf(String.format("%.2f", this.salary));
    }


}
