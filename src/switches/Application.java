package switches;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        //Switch can only check certain variables like int and string
        Scanner fromKey = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String dayOfWeek = fromKey.nextLine();

        switch (dayOfWeek) {
            case "monday":
                System.out.println("It is Monday!");
                break;
            case "tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "wednesday":
                System.out.println("It is wednesday!");
                break;
            case "thursday":
                System.out.println("It is thursday!");
                break;
            case "friday":
                System.out.println("It is Friday!");
                break;
            case "saturday":
                System.out.println("It is Saturday!");
                break;
            case "sunday":
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Not a day of the week!");
        }




    }


}
