package methodparameters;


class Robot {

    //set up method so it comes our here second
    // the parantheses is passing a paramter through method, variable you pass into a method
    public void speak(String text) {
        System.out.println(text);
    }

    //method with int
    public void jump (int height) {
        System.out.println("Jumping " + height);
    }

    //multiple parameters separated by commas
    public void move (String direction, double distance) {
        System.out.println("Moving " + distance + " in direction " + direction);
    }



}

public class App {

    public static void main(String[] args) {

        Robot sam = new Robot();

        //Input data here through the "basket first"
       // sam.speak();
        sam.speak("Hi I'm Sam.");
        sam.jump(7);

        //values that are inputted must match the variable type listed in the parameters
        sam.move("West", 12.2);

        //creating variable and using method to print it
        String greeting = "Hello there";
        sam.speak(greeting);

        int value = 14;
        sam.jump(value);


    }

}
