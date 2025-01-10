package Lec5.Abstract.Interfaces;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("I start electric engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop electric engine");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate electric engine");
    }
}
