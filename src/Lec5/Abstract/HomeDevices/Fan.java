package Lec5.Abstract.HomeDevices;

public class Fan implements Controlable{
     public void off(){
        System.out.println("Fans turned off!");
    }
    public void on (){
        System.out.println("Fans turned on !");
    }
}
