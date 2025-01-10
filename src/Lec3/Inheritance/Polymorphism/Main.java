package Lec3.Inheritance.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape= new Shapes();
        Circles circle = new Circles();
        Square square = new Square();
        Shapes a = new Circles();
        a.area();
        // 1.reference variables type defines what are things it can access
        // that's why we need to have same method in parent regardless of it is
        // being overriden
        // 2. object type defines the overriding stuffs
    }
}
