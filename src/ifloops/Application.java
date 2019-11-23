package ifloops;

public class Application {

    public static void main(String[] args) {

        boolean condition = 1 < 6;
        boolean anotherConditino = 3 > 8;
        boolean isIt = 5 != 2;

        System.out.println(condition);
        System.out.println(anotherConditino);
        System.out.println(isIt);

        if (4 == 4) {
            System.out.println("Yes it's true! ");
        }

        int myInt = 20;
        if (myInt < 30) {
            System.out.println("yes it is");
        } else if (myInt > 15) {
            System.out.println("It's greater than 15");
        } else {
            System.out.println("No it isn't");
        }




    }


}
