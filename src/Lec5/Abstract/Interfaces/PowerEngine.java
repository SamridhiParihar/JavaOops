package Lec5.Abstract.Interfaces;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("I start my power Engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop my power Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate my power Engine");
    }
}
