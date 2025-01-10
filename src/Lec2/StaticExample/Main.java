package Lec2.StaticExample;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Human Sam = new Human(21,"Parihar", 10000000, false);
        System.out.println(Sam.population);
        Human Sam2 = new Human(21,"Parihar", 10000000, false);
        System.out.println(Sam.population);
        Human Sam3 = new Human(21,"Parihar", 10000000, false);
        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();
    }

    // using a non-static inside a static
    static void fun(){
       // fun2(); wrong
        // we can't access non static stuff without referencing their instance in static context
        Main obj = new Main();
        obj.fun2();
    }
    void fun2(){
        fun();

    }
}
