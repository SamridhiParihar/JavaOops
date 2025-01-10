package Lec5.Abstract.HomeDevices;

public class SmartDevicesControl {
    private Controlable device;

    // Default constructor initializes the control to a fan, as you mentioned
    public SmartDevicesControl() {
        this.device = new Fan();
    }

    // Set any controllable device (lights, AC, speaker, etc.)
    public void setDevice(Controlable device) {
        this.device = device;
    }

    // Turn on the current device
    public void on() {
        device.on();
    }

    // Turn off the current device
    public void off() {
        device.off();
    }
}
