package smarthome;

public class SmartHomeFacade {
    private Lighting lighting;
    private MusicSystem musicSystem;
    private ClimateControl climateControl;
    private SecuritySystem securitySystem;
    private VoiceAssistant voiceAssistant;

    public SmartHomeFacade(Lighting lighting, MusicSystem musicSystem, ClimateControl climateControl,
                           SecuritySystem securitySystem, VoiceAssistant voiceAssistant) {
        this.lighting = lighting;
        this.musicSystem = musicSystem;
        this.climateControl = climateControl;
        this.securitySystem = securitySystem;
        this.voiceAssistant = voiceAssistant;
    }

    public void startMorningRoutine() {
        lighting.on();
        climateControl.setTemperature(24);
        securitySystem.disarm();
        voiceAssistant.activate();
    }

    public void endMorningRoutine() {
        lighting.off();
        securitySystem.arm();
        voiceAssistant.deactivate();
    }

    public void startEveningRoutine() {
        lighting.on();
        musicSystem.playMusic();
        climateControl.setTemperature(22);
        securitySystem.arm();
    }

    public void endEveningRoutine() {
        lighting.off();
        musicSystem.stopMusic();
        securitySystem.disarm();
    }
}

