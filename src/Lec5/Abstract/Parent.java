package Lec5.Abstract;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    abstract void career(String name);
    abstract void Part(String name,int age);
}
