package exceptions1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args)  { //method 1 of handling exceptions

        File file = new File("test.txt"); //import the file

        //method 2 of handling exception
        try {
            FileReader fr = new FileReader(file); //read the file by passing file object
            //below wont run if exception is being thrown...
            System.out.println("Continuing ...");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }
        //The error message at the bottom when running is called a "stack trace"

        System.out.println("Running ....");


    }

}
