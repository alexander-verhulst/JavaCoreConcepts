package whileloops;

public class Application {

    public static void main(String[] args) {
        int value = 0;
        boolean loop = value < 20;
        System.out.println(loop); // prints true

        //if condition is true, the loop will run
        while (value < 10) {
            value = value + 1; //without this, you would have a infinite loop
            System.out.println("Hello " + value); //prints hello 1 - hello 10
        }

        int newLoop = 0;
        while (newLoop < 5) {
            System.out.println("Looping " + newLoop);
            if (newLoop == 5) {
                break;
            }
            newLoop++;
            System.out.println("Running");
        }




    }

}
