package Lec2.Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 =  SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();
        // all 3 variables are referencing to the same objects
    }


}

class Sinlgeton2{
    private Sinlgeton2(){}

    private static Sinlgeton2 instance = null;
    public static Sinlgeton2 getInstance(){
        if(instance==null){
            instance = new Sinlgeton2();
        }
        return instance;
    }
}