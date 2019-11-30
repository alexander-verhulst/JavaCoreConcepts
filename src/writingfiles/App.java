package writingfiles;

import java.io.*;

public class App {

    public static void main(String[] args) {

        File file = new File("writing.txt");
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write("This is line one ");
            br.newLine();
            br.write("This is line two");
            br.newLine();
            br.write("This is line three");
            br.write("\n");
            br.write("Last line");

        } catch (IOException e) {
            System.out.println("File not found: " + file.toString());
        }

    }

}
