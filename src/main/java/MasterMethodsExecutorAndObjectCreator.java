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
//        createStudent();
        operationsWithIfs();

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
//        printTextLine(anotherOneStringContact + rasma.getFirstName());
//        printTextLine("Student last name : " + rasma.getLastName());
//        printTextLine("Student age : " + String.valueOf(rasma.getAge()));

        printTextLine("Is Student ID is active : " + String.valueOf(rasma.getIsisActiveStudentId()));

        rasma.setActiveStudentId(false);
        printTextLine("Current student ID status : " + String.valueOf(rasma.getIsisActiveStudentId()));
        rasma.changeFirstName("Jautrite");
        printTextLine("Cureent " + STUDENT_NAME + rasma.getFirstName());
    }

    private void operationsWithIfs() {
        int one = 1;
        int two = 2;
        boolean simplyTrue = true;

        if(one == 3) {
            printTextLine("Yes, it is three");
        } else if(one == 5) {
            printTextLine("Yes, it is five");
        } else if (one == 7) {
            printTextLine("Yes, it is seven");
        } else {
            printTextLine("Yes, it is something else");
        }

        if (one == 3 || one == 1 || two ==4) {
            printTextLine("Yes, it is true");
        }

        if( one == 1 && two ==1) {
            printTextLine("Yes, it is true | Second");
        } else if (one == 1 && two ==2) {
            printTextLine("Yes, it is true | Third");
        }

        if( (one == 1 && two ==1) || one ==1) {
            printTextLine("Yes, it is true | with AND and ELSE");
        }

        if(simplyTrue) {
            printTextLine("it is simply");
        }
        Student rasma = new Student("Rasma", "Veidemane", 18, false);

        if(rasma.getIsisActiveStudentId()) {
            printTextLine("Yes " + rasma.getFirstName() + " Student ID card is active");
        } else {
            printTextLine("No " + rasma.getFirstName() + " Student ID card is not active");
        }

    }

}
