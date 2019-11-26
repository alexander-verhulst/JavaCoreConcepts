package collections;

import javax.swing.*;
import java.util.*;

public class App {

    public static void main(String[] args) {

        int [] array = {1, 4, 5, 0};
        System.out.println(array.length);

        List arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
        arrayList.add(1);
        arrayList.add("John");
        arrayList.add(4.5);
        arrayList.add(3.4);

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0)); //output 1
        System.out.println(arrayList.get(2));

        arrayList.add(1,77);//int i , object e
        System.out.println(arrayList); // [1, 77, John, 4.5, 3.4]

        //define the type of array
        List <String> names = new ArrayList();
        names.add("John");
        names.add("Bob");
        names.add("Susan");
        names.remove(0); //remove by index
        names.remove("Bob"); //remove by object
        System.out.println(names.size());
        System.out.println(names);

        names.add("Mike");
        names.add("Dick");
        names.add("Steve");
        for (String name : names) {
            if (name.startsWith("Di")) //remove this if statement to loop through and print all the names
            System.out.println(name);
        }

        Set mySet = new HashSet();
        //good if you want to make sure there are no repeat values
        mySet.add("one");
        mySet.add("two");
        mySet.add("three");
        mySet.add("four");
        mySet.add("two"); //doesn't print this value out

        System.out.println(mySet.size()); // 4
        System.out.println(mySet);

        Map <String, String> myMap = new HashMap();
        myMap.put("AB1000", "Red Hat");
        myMap.put("SSD110", "Blue Shirt");
        myMap.put("ED4563", "Green Shorts");
        myMap.put("EH3456", "Dark Blue Shirt");
        myMap.put("EH3456", "Dark Blue Shirt"); //Doesn't print this repeat value

        System.out.println(myMap.size());
        System.out.println(myMap);
        System.out.println(myMap.get("AB1000")); //use the id to find the value
        System.out.println("Print Map");
        Set <String> keys = myMap.keySet(); //get the keys of the map
        System.out.println(keys);
        for (String key : keys) {
            System.out.println(key + " " + myMap.get(key)); //Prints id with values
        }

        System.out.println("Print the Map Value");
        if (myMap.containsKey("Ab10")) {
            System.out.println(myMap.get("Ab10"));
        } else
            System.out.println("There is no Ab10");

        if (myMap.containsValue("Blue Shirt"))
            System.out.println("Map contains this value");

        myMap.replace("AB1000", "Black Hat");
        System.out.println(myMap.get("AB1000"));

        System.out.println(myMap.values());

        //find print the key and values for all t shirts in this collection
        for (String key : keys) {
            String value = myMap.get(key);
            if (value.contains("shirt"))
                System.out.println(key + "            "  + value);
        }


    }

}

//Collections in Java: list, map, and set

//create methods, call methods, write into file, read file
//user input
