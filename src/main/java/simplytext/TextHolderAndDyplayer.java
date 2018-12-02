package main.java.simplytext;

import static main.java.printer.Printer.printTextLine;

public class TextHolderAndDyplayer {
    public void displaySomeText() {
        String firstStringVariable = "I'm starting to learn Java basics!";
        String textValueFromOtherMethod = getSomeText();
        printTextLine("Hello TDL");
        printTextLine(firstStringVariable);
        printTextLine(textValueFromOtherMethod);

        char oneChar = 'A';

        printTextLine(oneChar);
    }


    private static String getSomeText() {
        return "So far so good!";
    }

}
