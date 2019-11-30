package multipleexceptions;

import java.io.IOException;
import java.sql.SQLOutput;
import java.text.ParseException;

public class App {

    public static void main(String[] args) throws IOException, ParseException { //method 1 of exceptions

        Test test = new Test();
        test.run();

        //method 2 of exceptions
        Test test2 = new Test();
        try {
            test2.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }

        //Method 3, multiple exception

        Test test3 = new Test();
        try {
            test3.run();
        } catch (IOException | ParseException e) {
            System.out.println("Couldn't parse command file.");
        }


        //Handle child exceptions prior to adult exceptions



    }

}
