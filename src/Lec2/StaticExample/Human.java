package Lec2.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    // properties that aren't related to objects but are common to all the
    // objects of that class .....than that property is static
    static long population;
    Human(int age, String name , int salary , boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
    }
}
// static :
/* 1. we can create static variable as well as method
   2. These are object independent
   3. Inside a static method we can't use a non static
      ( since something which is non static belongs to object )
      since non static will have insatnce(Dependent on object ) but static
      won't be dependent on object
* */

