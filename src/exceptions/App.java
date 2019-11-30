package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) throws FileNotFoundException { //method 1 of handling exceptions

        File file = new File("test.txt"); //import the file
        FileReader fr = new FileReader(file); //read the file by passing file object
        //The error message at the bottom when running is called a "stack trace"


    }
}
