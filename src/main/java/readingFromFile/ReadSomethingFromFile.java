package main.java.readingFromFile;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadSomethingFromFile {

    public void letsReadThatTextFile() {
        String projectDirectoryFullPath = System.getProperty("user.dir");
        String pathToCurrentProjectTextFilePackage = "/src/main/resources/textfiles/";
        String textFileName = "textFile.txt";
        List<String> stringi = new ArrayList<>();
        StringBuilder temporaryPlaceWhereCreateStringFromChars = new StringBuilder();

        try {
            FileReader fr = new FileReader(projectDirectoryFullPath + pathToCurrentProjectTextFilePackage + textFileName);

            int decimalValueOfCharWhichComesFromFile;
            while ((decimalValueOfCharWhichComesFromFile = fr.read()) != -1) { //read metode iet cauri faila saturam, simbolu pa simbolam un atgriež tā simbolu decimālo vērtību. Decimālās vērtības skatīt kādā ascii tabulā

                if (decimalValueOfCharWhichComesFromFile > 32 && decimalValueOfCharWhichComesFromFile != 59) { //tiek salīdzināt ar char decimālajām vērtībām. Līdz 32. Dec vērtībai ir atstartpes, jaunu rindu simboli. Char ar 59 Dec vērtību ir semikols.
                    temporaryPlaceWhereCreateStringFromChars.append((char)decimalValueOfCharWhichComesFromFile);
                } else {
                    stringi.add(temporaryPlaceWhereCreateStringFromChars.toString());
                    temporaryPlaceWhereCreateStringFromChars.setLength(0);
                }
            }
            stringi.add(temporaryPlaceWhereCreateStringFromChars.toString());
            temporaryPlaceWhereCreateStringFromChars.setLength(0);
            fr.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {

            System.out.println("This comes from finally. File reading is done. Either it was successful or not" + (char)32);
            System.out.println(stringi);
        }
    }

}
