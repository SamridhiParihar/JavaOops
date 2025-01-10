package Lec5.Abstract.HomeDevices;

public class Speaker implements Controlable{
    public void off(){
        System.out.println("Speaker turned off!");
    }
    public void on (){
        System.out.println("Speaker turned on !");
    }
}
