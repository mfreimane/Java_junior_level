package main.java;

public class JavaCourse {
    public static void main(String[] args){
        String firstStringVariable = "I'm starting to learn Java basics!";
        String textValueFromOtherMethod = getSomeText();


        System.out.println("Hello TDL");
        System.out.println(firstStringVariable);
        System.out.println(textValueFromOtherMethod);
    }

    private static String getSomeText() {
        return "So far so good!";
    }
}
