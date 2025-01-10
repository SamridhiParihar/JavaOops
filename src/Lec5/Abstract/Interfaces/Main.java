package Lec5.Abstract.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car mycar = new Car();
//        mycar.stop();
//        mycar.start();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine(new ElectricEngine());
        car.start();
    }
}
