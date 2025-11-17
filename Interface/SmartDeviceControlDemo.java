interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light turned ON"); }
    public void turnOff() { System.out.println("Light turned OFF"); }
}

class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC turned ON"); }
    public void turnOff() { System.out.println("AC turned OFF"); }
}

class TV implements SmartDevice {
    public void turnOn() { System.out.println("TV turned ON"); }
    public void turnOff() { System.out.println("TV turned OFF"); }
}

public class SmartDeviceControlDemo {
    public static void main(String[] args) {
        SmartDevice device = new Light();
        device.turnOn();
        device.turnOff();

        device = new AC();
        device.turnOn();
        device.turnOff();

        device = new TV();
        device.turnOn();
        device.turnOff();
    }
}
