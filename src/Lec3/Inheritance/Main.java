package Lec3.Inheritance;
import Lec4.Access.A;
public class Main {
    public static void main(String[] args) {
        Box a = new Box();
        a.info();
         // reference variable of parent type but the object of child class is possible
        Box obj = new BoxWeight(8,5,4,3);

        // But the converse isn't possible
        //BoxWeight obj1 = new Box(1,2,3); gives an error

        // the reason : since child class can initialize parent class variable by super keyword
        // but the parent class is not aware about child class variables and methods
    }
}
class Trial extends A{
    Trial(int num , String name){
        super(num,name);
    }

    public static void main(String[] args) {
        A obj = new A(10,"sam");
        //int k =obj.num; // this gives me error check lec 4 theory point 2
        A obj1 = new Trial(99,"ss");
        //int k= obj1.num; //this also gives error
        Trial obj2 = new Trial(0,"sp");
        int k=obj2.num;
    }
}
class Subsub extends Trial{
    Subsub(int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subsub obj = new Subsub(9,"k");
        int k = obj.num;
    }
}
