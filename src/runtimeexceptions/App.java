package runtimeexceptions;


import java.awt.*;

public class App {

    public static void main(String[] args) throws InterruptedException {


        //checked exceptions//
        //needs to be dealt with asap
        Thread.sleep(111); //checked exception makes you deal with it right away

        //Runtime exceptions//
        //basic fundamental rules being broke
        int value = 7; //runtime exception, deal with it later
        value = value/0;

        String text = null;
        System.out.println(text.length()); //has a reference that points to nowhere

        //array out of bounds exception//
        String [] texts = {"one", "two", "three"};
            try {
                System.out.println(texts[3]);// runtime exception
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }




    }
}
