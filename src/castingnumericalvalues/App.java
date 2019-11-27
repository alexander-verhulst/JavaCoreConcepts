package castingnumericalvalues;

import org.w3c.dom.ls.LSOutput;
//casting: will this work? Do I have enough memory?v


public class App {

    public static void main(String[] args) {

        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 3435454;
        float floatValue = 234.34f;
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);
        //cast is to store numerical values of different types
        intValue = (int) longValue;
        System.out.println(intValue);


        doubleValue = intValue;
        System.out.println(doubleValue);

//        intValue = floatValue; //will lose .34f
        intValue = (int)floatValue;
        System.out.println(intValue

//        byteValue = (byte)128;



        );

    }

}
