package Lec4.Access;

public class ObjectDemo {
    int num;
    ObjectDemo(int num){
        this.num=num;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        //return super.hashCode(); it actually gives unique no for each object
        return this.num/2;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
////    protected void finalize() throws Throwable {
////        super.finalize();
////    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj2 = new ObjectDemo(34);
//        System.out.println(obj.hashCode());
//        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj2));
    }
}
