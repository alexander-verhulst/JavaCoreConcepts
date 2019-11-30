package filereaderandbufferedreader;

import java.io.*;

public class App {

    public static void main(String[] args) {

        File file = new File("test.txt");

        BufferedReader br = null;


        //read the file
        try {
            FileReader fr = new FileReader(file);
            //process one line at a time
             br = new BufferedReader(fr);
            String line; //point to each line in the file
         //   line = br.readLine(); //add another catch clause

            //print the whole text document and read all the lines
            while ( (line = br.readLine()) != null) {
                System.out.println(line);
            }


          //  System.out.println(line); //reads the first line

        } catch (FileNotFoundException e) {
            //better than stack trace display
            //file.troString specifies isn't found, good practice
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file with buffered reader: " + file.toString());
        }

        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
