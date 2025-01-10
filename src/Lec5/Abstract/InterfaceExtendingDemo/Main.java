package Lec5.Abstract.InterfaceExtendingDemo;

public class Main implements A, B{
    @Override
    public void fun() {
        System.out.println("have fun");
    }

    @Override
    public void greet() {
        System.out.println("hello!");
    }

    public static void main(String[] args) {
        A obj = new Main();
        obj.fun();
       // obj.cricket(); compile error we can't access static method of interface via instance
        // we need to access it via interface name only but in class extending class we can do it
        // However it isn't considered as a good practice
        A.cricket();
    }
}
