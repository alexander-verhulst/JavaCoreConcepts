package stringbuilder;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class App {

    public static void main(String[] args) {

        //inefficient
        String info = "";
        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";
        System.out.println(info);

        //More memory efficient method of adding text
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion builder");
        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("My name is Roger. ")
        .append(" ") //append is reference
                .append("I am a sky diver")
                .append("");
        System.out.println(s.toString());

        //////Formatting //////////////////
        System.out.println("Here is some text.\tThat was a tab \nThat was a new line");
        System.out.println("More text");

        //print format

        //more control then concatenation
        //formating the % symbol
        System.out.printf("Total %-10d; quanitity is %d", 5, 120);     //%d = integer

        for (int i = 0; i<20; i++) {
            System.out.printf("%2d: %s\n", i, "here is some text");
        }

        System.out.printf("Total value: %f\n", 5.6);
        System.out.printf("Total value: %.2f\n", 5.6); //number of decimal places




    }
}
