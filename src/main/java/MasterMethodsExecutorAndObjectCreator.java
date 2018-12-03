package main.java;

import main.java.human.Human;
import main.java.human.Student;
import main.java.simplytext.TextHolderAndDyplayer;
import static main.java.printer.Printer.*;
import static main.java.projectConstants.SomeConstants.STUDENT_NAME;

public class MasterMethodsExecutorAndObjectCreator {
    public void executeMethodsAndCreateObjects() {
//        callMethodWhichWillPrintSomeText();
//        createHuman();
        createStudent();

    }

    private void callMethodWhichWillPrintSomeText() {
        TextHolderAndDyplayer textHolderAndDyplayer = new TextHolderAndDyplayer();
        textHolderAndDyplayer.displaySomeText();
    }

    private void createHuman() {
        Human janis = new Human("Janis", "Berzins", 15);
        printTextLine(janis.getAge());
        printTextLine(janis.getFirstName());
        printTextLine(janis.getLastName());
    }

    private void createStudent() {
        Student rasma = new Student("Rasma", "Veidemane", 18, true);
        boolean thisIsBooleanVariable = rasma.getIsisActiveStudentId();
        String thisIsStringVariable = String.valueOf(rasma.getIsisActiveStudentId());
        String anotherOneStringContact = "Another name : ";

        printTextLine(STUDENT_NAME + rasma.getFirstName());
        printTextLine(anotherOneStringContact + rasma.getFirstName());
        printTextLine("Student last name : " + rasma.getLastName());
        printTextLine("Student age : " + String.valueOf(rasma.getAge()));
        printTextLine("Is Student ID is active : " + String.valueOf(rasma.getIsisActiveStudentId()));

    }

}
