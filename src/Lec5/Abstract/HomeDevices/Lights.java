package Lec5.Abstract.HomeDevices;

public class Lights implements Controlable{
    public void off(){
        System.out.println("Lights turned off!");
    }
    public void on (){
        System.out.println("Lights turned on !");
    }
}
