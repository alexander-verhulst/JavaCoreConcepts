package readingfilesscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

//        String fileName = "C:\\Users\\ftrr2\\OneDrive\\Desktop\\udemyjava.txt"; //can also use just one / slash
        //Since file is now in the project folder we can call just the file name
        String fileName = "udemyjava.txt"; //make sure file is in the main project folder

        //create file object to be representation of file
        File textFile = new File(fileName);

        //read the file
        Scanner in = new Scanner(textFile); //1st way. try catch with this code 2nd way. Throws FileNot.. on main

        //loop to read whole file
       /* while (in.hasNextLine()) { //read strings in the file
            String line = in.nextLine();
            System.out.println(line);
        } */

       int value = in.nextInt();
        System.out.println("Read value: " + value);

        //removing "invisible" character in line so the while loop doesn't mess up the count
        in.nextLine();

        int count = 2;
        while (in.hasNextLine()) { //read strings in the file
            String line = in.nextLine();
            System.out.println(count + ": " + line);
            count++;
        }



        in.close(); //close the scanner



    }

}
