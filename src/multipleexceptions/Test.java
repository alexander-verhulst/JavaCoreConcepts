package multipleexceptions;

import java.io.IOException;
import java.text.ParseException;

public class Test {

    public void run() throws IOException, ParseException { //can only throw one exception at a time
        //throws an exception in this method
        //throw new IOException();
        throw new ParseException("Error in command list. ", 2);

    }

}
