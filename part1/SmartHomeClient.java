package smarthome;

public class SmartHomeClient {
    public static void main(String[] args) {
        // Create instances of subsystems
        Lighting lighting = new Lighting();
        MusicSystem musicSystem = new MusicSystem();
        ClimateControl climateControl = new ClimateControl();
        SecuritySystem securitySystem = new SecuritySystem();
        VoiceAssistant voiceAssistant = new VoiceAssistant();

        // Create a SmartHomeFacade
        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(
                lighting, musicSystem, climateControl, securitySystem, voiceAssistant);

        // Note the above code to create a SmartHomeFacade instance could be
        // extracted into its own function or even a factory class to make it
        // easier to create a facade instance.

        // Client initiates the morning routine
        System.out.println("\n=== Initiating Morning Routine ===");
        smartHomeFacade.startMorningRoutine();
        // Simulate some activities during the morning
        System.out.println("User performs morning activities.");
        // Client ends the morning routine
        smartHomeFacade.endMorningRoutine();
        System.out.println("=== Morning Routine Completed ===");

        // Client initiates the evening routine
        System.out.println("=== Initiating Evening Routine ===");
        smartHomeFacade.startEveningRoutine();
        // Simulate some activities during the evening
        System.out.println("User performs evening activities.");
        // Client ends the evening routine
        smartHomeFacade.endEveningRoutine();
        System.out.println("=== Evening Routine Completed ===");
    }
}
