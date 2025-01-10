package Lec5.Abstract;

public class Son extends  Parent{
    public Son(int age) {
        super(age);
        //this.age=age;
    }

    @Override
    void career(String name) {
        System.out.println("I will be a "+name);
    }

    @Override
    void Part(String name, int age) {
        System.out.println("She is "+name+ " and her age is "+age);
    }
}
