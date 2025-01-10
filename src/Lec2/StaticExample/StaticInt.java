package Lec2.StaticExample;

public class StaticInt {
    //demo to show initialization of static varibles
    static int a = 4;
    static int b;
    // static block is used to initialize static variables
    // which is called only once when the class is loaded for the first time
    // or when the first object is created
    static{
        System.out.println("I am in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a+ " "+StaticInt.b);
        StaticInt.b+=3;
        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a+ " "+StaticInt.b);
    }
}
