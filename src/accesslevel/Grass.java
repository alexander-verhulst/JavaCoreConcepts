package accesslevel;

import accesslevel2.Plant; //Imports from other package

// Extends class from another package
public class Grass extends Plant {

    public Grass() {
//        System.out.println(this.height); Grass not in same package of plant since height doesn't have specifier
    }
}
