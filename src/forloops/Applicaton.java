package forloops;

public class Applicaton {

    public static void main(String[] args) {

        //code that executes before code start ; as long as this condition is true, code runs; action condition true
        for (int i = 0 ; i < 5 ; i++) {

          // System.out.println("Hello " + i);

            System.out.println();

            //format specifier. %d is used for integers
            System.out.printf("The value of i is: %d", i);

        } //end of for loop

    }

}
