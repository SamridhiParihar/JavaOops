package Lec5.Abstract.Interfaces;

public class CDPlayer implements Media {

    @Override
    public void start() {
        System.out.println("I start my CDPlayer");
    }

    @Override
    public void stop() {
        System.out.println("I stop my CDPlayer");
    }
}
