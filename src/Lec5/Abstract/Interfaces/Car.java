package Lec5.Abstract.Interfaces;

public class Car implements Engine,Brake,Media{
    public void start(){
        System.out.println("I start like a normal car");
    }
    public void stop(){
        System.out.println("I stop like a normal car");
    }
    public void brake(){
        System.out.println("I brake like a normal car");
    }
    public void accelerate(){
        System.out.println("I accelerate like a normal car");
    }
}
