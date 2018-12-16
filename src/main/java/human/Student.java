package main.java.human;

import static main.java.projectConstants.SomeConstants.THIS_IS_OVERRIDE;

public class Student extends Human {
    private boolean isActiveStudentId;

    public Student(String firstName, String lastName, int age, boolean isActiveStudentId) {
        super(firstName, lastName, age);
        this.isActiveStudentId = isActiveStudentId;
    }

    public boolean getIsisActiveStudentId() {
        return isActiveStudentId;
    }

    public void setActiveStudentId(boolean changedStudentIDActivity) {
        this.isActiveStudentId = changedStudentIDActivity;
    }

    public void changeFirstName(String changedFirstName) {
        super.firstName = changedFirstName;
    }

    @Override
    public String getFirstName() {
        return THIS_IS_OVERRIDE + super.firstName;
    }
}
