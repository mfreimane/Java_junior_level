package main.java;

import main.java.human.Human;
import main.java.human.Student;
import main.java.simplytext.PrintNumbers;
import main.java.simplytext.TextHolderAndDyplayer;

import static main.java.printer.Printer.printTextLine;

public class MasterMethodsExecutorAndObjectCreator {
    public void executeMethodsAndCreateObjects() {
//        callMethodWhichWillPrintSomeText();
        createHuman();
        callMethodPrintSomeText();

    }

    private void callMethodWhichWillPrintSomeText() {
        TextHolderAndDyplayer textHolderAndDyplayer = new TextHolderAndDyplayer();
        textHolderAndDyplayer.displaySomeText();
    }

    private void callMethodPrintSomeText() {
        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.printText();
    }

    private void createHuman() {
        Human janis = new Human("Janis", "Berzins", 15);
        printTextLine(janis.getFirstName());
        printTextLine(janis.getLastName());
    }

    private void createStudent() {
        Student rasma = new Student("Rasma", "Veidemane", 18, true);
    }

}
