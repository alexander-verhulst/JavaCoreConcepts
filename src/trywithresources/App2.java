package trywithresources;

import java.io.*;

public class App2 {

    public static void main(String[] args) {

        File file = new File("trywithresources.txt");
        //old way
//        FileReader fr = new FileReader(file);
//        BufferedReader br = new BufferedReader(fr);
        //better way to read file
       try (BufferedReader br = new BufferedReader(new FileReader(file))) {
           String line;
           while ((line = br.readLine()) != null) {
               System.out.println(line);
           }
       } catch (FileNotFoundException e) {
           System.out.println("Cannot find file: " + file.toString());
       } catch (IOException e) {
           System.out.println("Unable to read file: " + file.toString());
       }


    }

}
