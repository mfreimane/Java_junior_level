package main.java;

import main.java.vehicles.Bicycle;

public class JavaCourse {
    public static void main(String[] args){
        String firstStringVariable = "I'm starting to learn Java basics!";
        String textValueFromOtherMethod = getSomeText("some parameter");

        TextProvider textProvider = new TextProvider();

        System.out.println("Hello TDL");
        System.out.println(firstStringVariable);
        System.out.println(textValueFromOtherMethod);

        System.out.println(textProvider.getSomething());

        letsPrintSomeText();

        Bicycle bike = new Bicycle();
        Bicycle bike2 = new Bicycle("Black");
    }

    private static String getSomeText(String someString) {
        int somenum = 0;
        System.out.println(somenum);
        System.out.println(someString );
        return "So far so good";
    }

    private static void letsPrintSomeText(){
        System.out.println("void method");
    }
}
