package Lec3.Inheritance.Polymorphism;

public class ObjectPrint {
    int num;
    @Override
    public String toString(){
        return "ObjectPrint{"+
                "num="+ num +
                "}";
    }
    public ObjectPrint(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(2);
        System.out.println(obj);
    }
}
