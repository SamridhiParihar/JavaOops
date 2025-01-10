package Lec2.StaticExample;

// outside classes can't be static
class A_outside{
    int a ;
    A_outside(int a ){
        this.a=a;
    }
}
public class InnerClasses {
    static class A_inside{
        int a ;
        A_inside(int a ){
            this.a=a;
        }
    }

    public static void main(String[] args) {
       // A_inside obj = new A_inside(5);
        // above is showing error since it is non static and it is
        // also not a outside class which means it is dependent on outer clas
        // however this would work fine if :
        // 1. either it is outside class which is not dependent on any classes
        // 2. or we declare it as a static class (examples are given below)

        A_outside obj = new A_outside(5); // this works fine point no 1
        A_inside obj2 = new A_inside(5); // this also works fine now since we make it as a static class

    }
}
