package Gevangenis;

public class Gevangenis {

    public static void main(String[] args) {
        ControlePaneel controlePaneel = new ControlePaneel();
        Alarm alarm = new Alarm("Eetzaal");
        Camera camera = new Camera("Eetzaal");

        AlarmAanCommand alarmAan = new AlarmAanCommand(alarm);
        AlarmUitCommand alarmUit = new AlarmUitCommand(alarm);
        CameraLowCommand cameraLow = new CameraLowCommand(camera);
        CameraMediumCommand cameraMedium = new CameraMediumCommand(camera);
        CameraHighCommand cameraHigh = new CameraHighCommand(camera);
        CameraUitCommand cameraUit = new CameraUitCommand(camera);

        Command[] aanCommands = {cameraHigh, alarmAan};
        Command[] uitCommands = {cameraLow, alarmUit};
        OntsnappingCommand ontsnappingCommandAan = new OntsnappingCommand(aanCommands);
        OntsnappingCommand ontsnappingCommandUit = new OntsnappingCommand(uitCommands);

        controlePaneel.setCommand(0,alarmAan, alarmUit);
        controlePaneel.setCommand(1,cameraLow,cameraUit);
        controlePaneel.setCommand(2,cameraMedium, cameraUit);
        controlePaneel.setCommand(3, cameraHigh, cameraUit);
        controlePaneel.setCommand(4, ontsnappingCommandAan,ontsnappingCommandUit);

        controlePaneel.aanKnopGedrukt(1);
        controlePaneel.aanKnopGedrukt(2);
        controlePaneel.undoKnopGedrukt();
        controlePaneel.aanKnopGedrukt(4);
        controlePaneel.undoKnopGedrukt();

    }
}
