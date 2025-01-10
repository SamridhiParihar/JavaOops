package Lec5.Abstract.HomeDevices;

public class Main {
    public static void main(String[] args) {
        SmartDevicesControl device = new SmartDevicesControl();
        device.off();
        device.on();
        device.setDevice(new Ac());
        device.off();
        device.on();
    }
}
