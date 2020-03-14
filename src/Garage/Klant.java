package Garage;

public class Klant {
    public static void main(String[] args) {
        Garagist garagist = new Garagist();
        BalieMedewerker balieMedewerker = new BalieMedewerker();

        AutoMotorCommand autoMotorCommand = new AutoMotorCommand(garagist);
        BrommerSpatbordCommand brommerSpatbordCommand = new BrommerSpatbordCommand(garagist);

        balieMedewerker.setCommand(autoMotorCommand);
        balieMedewerker.setCommand(brommerSpatbordCommand);

        balieMedewerker.vraagHerstelling();
        balieMedewerker.vraagHerstelling();


    }
}
