package dowhileloop;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner fromKey = new Scanner(System.in);

        //ctrl + shft + / for comment shortcut
        /*System.out.println("Enter a number: ");
        int value = fromKey.nextInt();
        while (value != 5) {
            System.out.println("Enter another number");
            value = fromKey.nextInt();
        }
        System.out.println("You got it!");*/


        System.out.println("Do While Loop");
        //variable must be declared outside the loop. Variable scope
        int value = 0;
        do {
            System.out.println("Enter a number: ");
            value = fromKey.nextInt();
        } while (value != 5);

            System.out.println("You got it!");








    }


}
