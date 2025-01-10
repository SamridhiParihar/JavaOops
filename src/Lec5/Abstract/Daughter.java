package Lec5.Abstract;

public  class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
        //this.age=age;
    }

    @Override
    void career(String name) {
        System.out.println("I will be a "+name);
    }

    @Override
    void Part(String name, int age) {
        System.out.println("He is "+name+ " and his age is "+age);
    }
}
