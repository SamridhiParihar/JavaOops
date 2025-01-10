package Lec5.Abstract.NestedInterfaces;

public class A {
    public interface nestedInterface{
        boolean isOdd(int num);
    }
}
class B implements A.nestedInterface {
    public boolean isOdd(int num){
        return (num%2!=0);
    }
}
class Main{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(5));
    }
}