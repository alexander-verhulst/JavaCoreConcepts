package arrays;

public class Application {

    public static void main(String[] args) {
        int [] values = new int[3];

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        System.out.println();
        System.out.println("Printing values in array with for loop: ");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println();

        int [] numbers = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        System.out.println();
        String [] words = new String[3];
        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        for (int i = 0; i < words.length; i ++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();

        System.out.println();
        String [] fruits = {"apple", "pineapple", "pen", "pineapplepen", "mango"};
        for (String e : fruits) {
            System.out.println(e);
        }

        //int is primitive data type
        int num = 0;

        //String is a class type, text is just a reference. Default value for references is null
        String text;





    }

}
