package trywithresources;

class Temp implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("oh no");
    }
}


public class App {

    public static void main(String[] args) {

       try (Temp temp = new Temp()) { //try with resources that implements autocloseable

       } catch (Exception e) {
           e.printStackTrace();
       } //close automatically called


    }

}
