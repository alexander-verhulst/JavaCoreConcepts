package exceptions2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {

        openFile();


    }

    public static void openFile() {
        File file = new File("test.txt"); //import the file
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            //Message is too vague
            System.out.println("Could not open file");
           // e.printStackTrace();
        }
    }


}
