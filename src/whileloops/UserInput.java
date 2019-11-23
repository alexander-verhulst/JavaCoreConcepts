package whileloops;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner fromKey = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String name = fromKey.nextLine();
        System.out.println("You first name is " + name);

        System.out.println("Enter your day of birth: ");
        int day = fromKey.nextInt();
        System.out.println("Your day of birth is " + day);

        System.out.println("Enter a decimal number: ");
        double dec = fromKey.nextDouble();
        System.out.println("You entered a decimal of " + dec);


    }


}
