package main.java.simplytext;

import static main.java.printer.PrinterForNumbers.printTextLine1;

public class PrintNumbers {

        public void displayNumbers() {
            int textValueFromOtherMethod3 = getSomeNumber();
            double textValueFromOtherMethod4 = getDoubleNumber();
            Integer textValueFromOtherMethod5 = getIntegerNumber();



            printTextLine1(textValueFromOtherMethod3);
            printTextLine1(textValueFromOtherMethod4);
            printTextLine1(textValueFromOtherMethod5);



        }

        private int getSomeNumber() {
            return 777;
        }

    private double getDoubleNumber() {
            return 7.1;
    }

    private static Integer getIntegerNumber() {
        return 7;
    }


    }
