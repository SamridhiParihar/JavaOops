package Lec5.Abstract.HomeDevices;

public class Ac implements Controlable{
    public void off(){
        System.out.println("AC turned off!");
    }
    public void on (){
        System.out.println("AC turned on !");
    }
}
