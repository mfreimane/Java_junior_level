package main.java.simplytext;

import static main.java.printer.Printer.printTextLine;

public class TextHolderAndDyplayer {
    public void displaySomeText() {
        String firstStringVariable = "I'm starting to learn Java basics!";
        String textValueFromOtherMethod = getSomeText();
        int textValueFromOtherMethod2 = getSomeNumber();
        printTextLine("Hello TDL");
        printTextLine(firstStringVariable);
        printTextLine(textValueFromOtherMethod);
        printTextLine(textValueFromOtherMethod2);

        char oneChar = 'A';

        printTextLine(oneChar);
    }


    private static String getSomeText() {
        return "So far so good!";
    }

    private int getSomeNumber() {
        return 777;
    }

}
