interface LightAction {
    void activate();
}

public class SmartHomeLightingAutomation {
    public static void main(String[] args) {
        
        LightAction motion = () -> System.out.println("Lights ON → Motion detected.");
        LightAction nightTime = () -> System.out.println("Lights ON → It is night time.");
        LightAction voiceCommand = () -> System.out.println("Lights ON → Voice command received.");

        motion.activate();
        nightTime.activate();
        voiceCommand.activate();
    }
}
