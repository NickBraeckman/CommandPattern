package CommandPattern.Garage;

public class AutoMotorCommand implements Command {
    private Garagist garagist;

    public AutoMotorCommand(Garagist garagist){
        this.garagist = garagist;
    }
    @Override
    public void execute() {
        garagist.vervangMotor();
        garagist.checkBandenSpanning();
    }
}
