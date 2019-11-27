package generics;

import java.util.ArrayList;
import java.util.HashMap;

class Animal {

}

public class App {

    public static void main(String[] args) {

        //Before Java 5 //
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add("Orange");
        list.add("Pear");
        String fruit = (String) list.get(1); //downcast to string
        System.out.println(fruit);

        //Modern Style//
        //Remeber this style
        ArrayList <String> strings = new ArrayList<String>();  //In <> you put what you want to specify,
        // array list of strings
        strings.add("cat");
        strings.add("dog");
        strings.add("donkey");
        String animal = strings.get(1); //do not need to downcast
        System.out.println(animal);

        //There can be more than one type of argument//
        HashMap <Integer, String> map = new HashMap<Integer, String>(); //takes more than one type of parameter
        map.put(1,"cat");
        map.put(2,"dog");
        map.put(3,"seal");
        System.out.println(map);

        //Java 7 Style//
        ArrayList <Animal> someList = new ArrayList<>();



    }

}
