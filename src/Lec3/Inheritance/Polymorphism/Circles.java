package Lec3.Inheritance.Polymorphism;

public class Circles extends Shapes {
    // this method area is overridden
    // this will be given priority over shapes(parent class method) whenever an object of circle is being created
    @Override // this is annotation
    void area(){
        System.out.println("Area is pie*r*r");
    }
}
